package typings.camelcaseKeys.mod

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
  		Recurse nested objects and objects in arrays.
  		@default false
  		*/
  val deep: js.UndefOr[Boolean] = js.native
  
  /**
  		Exclude keys from being camel-cased.
  		@default []
  		*/
  val exclude: js.UndefOr[js.Array[String | RegExp]] = js.native
  
  /**
  		Uppercase the first character as in `bye-bye` → `ByeBye`.
  		@default false
  		*/
  val pascalCase: js.UndefOr[Boolean] = js.native
  
  /**
  		Exclude children at the given object paths in dot-notation from being camel-cased. For example, with an object like `{a: {b: '🦄'}}`, the object path to reach the unicorn is `'a.b'`.
  		@default []
  		@example
  		```
  		camelcaseKeys({
  			a_b: 1,
  			a_c: {
  				c_d: 1,
  				c_e: {
  					e_f: 1
  				}
  			}
  		}, {
  			deep: true,
  			stopPaths: [
  				'a_c.c_e'
  			]
  		}),
  		// {
  		// 	aB: 1,
  		// 	aC: {
  		// 		cD: 1,
  		// 		cE: {
  		// 			e_f: 1
  		// 		}
  		// 	}
  		// }
  		```
  		*/
  val stopPaths: js.UndefOr[js.Array[String]] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDeep(value: Boolean): Self = this.set("deep", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDeep: Self = this.set("deep", js.undefined)
    
    @scala.inline
    def setExcludeVarargs(value: (String | RegExp)*): Self = this.set("exclude", js.Array(value :_*))
    
    @scala.inline
    def setExclude(value: js.Array[String | RegExp]): Self = this.set("exclude", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExclude: Self = this.set("exclude", js.undefined)
    
    @scala.inline
    def setPascalCase(value: Boolean): Self = this.set("pascalCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePascalCase: Self = this.set("pascalCase", js.undefined)
    
    @scala.inline
    def setStopPathsVarargs(value: String*): Self = this.set("stopPaths", js.Array(value :_*))
    
    @scala.inline
    def setStopPaths(value: js.Array[String]): Self = this.set("stopPaths", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStopPaths: Self = this.set("stopPaths", js.undefined)
  }
}

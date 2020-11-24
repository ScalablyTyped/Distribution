package typings.conventionalChangelogCore.mod.Options

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pkg extends js.Object {
  
  /**
    * The location of your "package.json".
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * A function that takes `package.json` data as the argument and returns the
    * modified data. Note this is performed before normalizing package.json data.
    * Useful when you need to add a leading 'v' to your version or modify your
    * repository url, etc.
    *
    * @defaults
    * Pass through.
    */
  var transform: js.UndefOr[js.Function1[/* pkg */ Record[String, _], Record[String, _]]] = js.native
}
object Pkg {
  
  @scala.inline
  def apply(): Pkg = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Pkg]
  }
  
  @scala.inline
  implicit class PkgOps[Self <: Pkg] (val x: Self) extends AnyVal {
    
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
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setTransform(value: /* pkg */ Record[String, _] => Record[String, _]): Self = this.set("transform", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteTransform: Self = this.set("transform", js.undefined)
  }
}

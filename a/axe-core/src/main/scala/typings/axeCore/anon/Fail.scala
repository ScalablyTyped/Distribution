package typings.axeCore.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Fail extends js.Object {
  
  var fail: String | StringDictionary[String] = js.native
  
  var incomplete: String | StringDictionary[String] = js.native
  
  var pass: String | StringDictionary[String] = js.native
}
object Fail {
  
  @scala.inline
  def apply(
    fail: String | StringDictionary[String],
    incomplete: String | StringDictionary[String],
    pass: String | StringDictionary[String]
  ): Fail = {
    val __obj = js.Dynamic.literal(fail = fail.asInstanceOf[js.Any], incomplete = incomplete.asInstanceOf[js.Any], pass = pass.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fail]
  }
  
  @scala.inline
  implicit class FailOps[Self <: Fail] (val x: Self) extends AnyVal {
    
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
    def setFail(value: String | StringDictionary[String]): Self = this.set("fail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIncomplete(value: String | StringDictionary[String]): Self = this.set("incomplete", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPass(value: String | StringDictionary[String]): Self = this.set("pass", value.asInstanceOf[js.Any])
  }
}

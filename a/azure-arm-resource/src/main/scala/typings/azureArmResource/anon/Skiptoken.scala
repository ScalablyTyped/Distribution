package typings.azureArmResource.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Skiptoken extends js.Object {
  
  var customHeaders: js.UndefOr[StringDictionary[String]] = js.native
  
  var skiptoken: js.UndefOr[String] = js.native
}
object Skiptoken {
  
  @scala.inline
  def apply(): Skiptoken = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Skiptoken]
  }
  
  @scala.inline
  implicit class SkiptokenOps[Self <: Skiptoken] (val x: Self) extends AnyVal {
    
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
    def setCustomHeaders(value: StringDictionary[String]): Self = this.set("customHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomHeaders: Self = this.set("customHeaders", js.undefined)
    
    @scala.inline
    def setSkiptoken(value: String): Self = this.set("skiptoken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkiptoken: Self = this.set("skiptoken", js.undefined)
  }
}

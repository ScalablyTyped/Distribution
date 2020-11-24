package typings.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImportTerminologyResponse extends js.Object {
  
  /**
    * The properties of the custom terminology being imported.
    */
  var TerminologyProperties: js.UndefOr[typings.awsSdk.translateMod.TerminologyProperties] = js.native
}
object ImportTerminologyResponse {
  
  @scala.inline
  def apply(): ImportTerminologyResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportTerminologyResponse]
  }
  
  @scala.inline
  implicit class ImportTerminologyResponseOps[Self <: ImportTerminologyResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setTerminologyProperties(value: TerminologyProperties): Self = this.set("TerminologyProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTerminologyProperties: Self = this.set("TerminologyProperties", js.undefined)
  }
}

package typings.awsSdk.translateMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Term extends js.Object {
  
  /**
    * The source text of the term being translated by the custom terminology.
    */
  var SourceText: js.UndefOr[String] = js.native
  
  /**
    * The target text of the term being translated by the custom terminology.
    */
  var TargetText: js.UndefOr[String] = js.native
}
object Term {
  
  @scala.inline
  def apply(): Term = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Term]
  }
  
  @scala.inline
  implicit class TermOps[Self <: Term] (val x: Self) extends AnyVal {
    
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
    def setSourceText(value: String): Self = this.set("SourceText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceText: Self = this.set("SourceText", js.undefined)
    
    @scala.inline
    def setTargetText(value: String): Self = this.set("TargetText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetText: Self = this.set("TargetText", js.undefined)
  }
}

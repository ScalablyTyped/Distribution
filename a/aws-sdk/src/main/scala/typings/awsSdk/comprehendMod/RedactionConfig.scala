package typings.awsSdk.comprehendMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RedactionConfig extends js.Object {
  
  /**
    * A character that replaces each character in the redacted PII entity.
    */
  var MaskCharacter: js.UndefOr[typings.awsSdk.comprehendMod.MaskCharacter] = js.native
  
  /**
    * Specifies whether the PII entity is redacted with the mask character or the entity type.
    */
  var MaskMode: js.UndefOr[PiiEntitiesDetectionMaskMode] = js.native
  
  /**
    * An array of the types of PII entities that Amazon Comprehend detects in the input text for your request.
    */
  var PiiEntityTypes: js.UndefOr[ListOfPiiEntityTypes] = js.native
}
object RedactionConfig {
  
  @scala.inline
  def apply(): RedactionConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RedactionConfig]
  }
  
  @scala.inline
  implicit class RedactionConfigOps[Self <: RedactionConfig] (val x: Self) extends AnyVal {
    
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
    def setMaskCharacter(value: MaskCharacter): Self = this.set("MaskCharacter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskCharacter: Self = this.set("MaskCharacter", js.undefined)
    
    @scala.inline
    def setMaskMode(value: PiiEntitiesDetectionMaskMode): Self = this.set("MaskMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaskMode: Self = this.set("MaskMode", js.undefined)
    
    @scala.inline
    def setPiiEntityTypesVarargs(value: PiiEntityType*): Self = this.set("PiiEntityTypes", js.Array(value :_*))
    
    @scala.inline
    def setPiiEntityTypes(value: ListOfPiiEntityTypes): Self = this.set("PiiEntityTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePiiEntityTypes: Self = this.set("PiiEntityTypes", js.undefined)
  }
}

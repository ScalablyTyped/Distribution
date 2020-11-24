package typings.awsSdk.servicecatalogMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CopyProductInput extends js.Object {
  
  /**
    * The language code.    en - English (default)    jp - Japanese    zh - Chinese  
    */
  var AcceptLanguage: js.UndefOr[typings.awsSdk.servicecatalogMod.AcceptLanguage] = js.native
  
  /**
    * The copy options. If the value is CopyTags, the tags from the source product are copied to the target product.
    */
  var CopyOptions: js.UndefOr[typings.awsSdk.servicecatalogMod.CopyOptions] = js.native
  
  /**
    *  A unique identifier that you provide to ensure idempotency. If multiple requests differ only by the idempotency token, the same response is returned for each repeated request. 
    */
  var IdempotencyToken: typings.awsSdk.servicecatalogMod.IdempotencyToken = js.native
  
  /**
    * The Amazon Resource Name (ARN) of the source product.
    */
  var SourceProductArn: ProductArn = js.native
  
  /**
    * The identifiers of the provisioning artifacts (also known as versions) of the product to copy. By default, all provisioning artifacts are copied.
    */
  var SourceProvisioningArtifactIdentifiers: js.UndefOr[SourceProvisioningArtifactProperties] = js.native
  
  /**
    * The identifier of the target product. By default, a new product is created.
    */
  var TargetProductId: js.UndefOr[Id] = js.native
  
  /**
    * A name for the target product. The default is the name of the source product.
    */
  var TargetProductName: js.UndefOr[ProductViewName] = js.native
}
object CopyProductInput {
  
  @scala.inline
  def apply(IdempotencyToken: IdempotencyToken, SourceProductArn: ProductArn): CopyProductInput = {
    val __obj = js.Dynamic.literal(IdempotencyToken = IdempotencyToken.asInstanceOf[js.Any], SourceProductArn = SourceProductArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyProductInput]
  }
  
  @scala.inline
  implicit class CopyProductInputOps[Self <: CopyProductInput] (val x: Self) extends AnyVal {
    
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
    def setIdempotencyToken(value: IdempotencyToken): Self = this.set("IdempotencyToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceProductArn(value: ProductArn): Self = this.set("SourceProductArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcceptLanguage(value: AcceptLanguage): Self = this.set("AcceptLanguage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcceptLanguage: Self = this.set("AcceptLanguage", js.undefined)
    
    @scala.inline
    def setCopyOptionsVarargs(value: CopyOption*): Self = this.set("CopyOptions", js.Array(value :_*))
    
    @scala.inline
    def setCopyOptions(value: CopyOptions): Self = this.set("CopyOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCopyOptions: Self = this.set("CopyOptions", js.undefined)
    
    @scala.inline
    def setSourceProvisioningArtifactIdentifiersVarargs(value: SourceProvisioningArtifactPropertiesMap*): Self = this.set("SourceProvisioningArtifactIdentifiers", js.Array(value :_*))
    
    @scala.inline
    def setSourceProvisioningArtifactIdentifiers(value: SourceProvisioningArtifactProperties): Self = this.set("SourceProvisioningArtifactIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceProvisioningArtifactIdentifiers: Self = this.set("SourceProvisioningArtifactIdentifiers", js.undefined)
    
    @scala.inline
    def setTargetProductId(value: Id): Self = this.set("TargetProductId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetProductId: Self = this.set("TargetProductId", js.undefined)
    
    @scala.inline
    def setTargetProductName(value: ProductViewName): Self = this.set("TargetProductName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetProductName: Self = this.set("TargetProductName", js.undefined)
  }
}

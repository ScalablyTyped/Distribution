package typings.classTransformer.exposeExcludeOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeOptions extends js.Object {
  
  var discriminator: js.UndefOr[Discriminator] = js.native
  
  /**
    * Is false by default.
    */
  var keepDiscriminatorProperty: js.UndefOr[Boolean] = js.native
}
object TypeOptions {
  
  @scala.inline
  def apply(): TypeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TypeOptions]
  }
  
  @scala.inline
  implicit class TypeOptionsOps[Self <: TypeOptions] (val x: Self) extends AnyVal {
    
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
    def setDiscriminator(value: Discriminator): Self = this.set("discriminator", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDiscriminator: Self = this.set("discriminator", js.undefined)
    
    @scala.inline
    def setKeepDiscriminatorProperty(value: Boolean): Self = this.set("keepDiscriminatorProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeepDiscriminatorProperty: Self = this.set("keepDiscriminatorProperty", js.undefined)
  }
}

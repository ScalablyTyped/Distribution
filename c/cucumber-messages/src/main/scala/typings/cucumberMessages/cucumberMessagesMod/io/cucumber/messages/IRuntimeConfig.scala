package typings.cucumberMessages.cucumberMessagesMod.io.cucumber.messages

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Properties of a RuntimeConfig. */
@js.native
trait IRuntimeConfig extends js.Object {
  
  /** RuntimeConfig isDryRun */
  var isDryRun: js.UndefOr[Boolean | Null] = js.native
  
  /** RuntimeConfig isFailFast */
  var isFailFast: js.UndefOr[Boolean | Null] = js.native
  
  /** RuntimeConfig isStrict */
  var isStrict: js.UndefOr[Boolean | Null] = js.native
  
  /** RuntimeConfig maxParallel */
  var maxParallel: js.UndefOr[
    Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any) | Null
  ] = js.native
}
object IRuntimeConfig {
  
  @scala.inline
  def apply(): IRuntimeConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IRuntimeConfig]
  }
  
  @scala.inline
  implicit class IRuntimeConfigOps[Self <: IRuntimeConfig] (val x: Self) extends AnyVal {
    
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
    def setIsDryRun(value: Boolean): Self = this.set("isDryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsDryRun: Self = this.set("isDryRun", js.undefined)
    
    @scala.inline
    def setIsDryRunNull: Self = this.set("isDryRun", null)
    
    @scala.inline
    def setIsFailFast(value: Boolean): Self = this.set("isFailFast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFailFast: Self = this.set("isFailFast", js.undefined)
    
    @scala.inline
    def setIsFailFastNull: Self = this.set("isFailFast", null)
    
    @scala.inline
    def setIsStrict(value: Boolean): Self = this.set("isStrict", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsStrict: Self = this.set("isStrict", js.undefined)
    
    @scala.inline
    def setIsStrictNull: Self = this.set("isStrict", null)
    
    @scala.inline
    def setMaxParallel(
      value: Double | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Long */ js.Any)
    ): Self = this.set("maxParallel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxParallel: Self = this.set("maxParallel", js.undefined)
    
    @scala.inline
    def setMaxParallelNull: Self = this.set("maxParallel", null)
  }
}

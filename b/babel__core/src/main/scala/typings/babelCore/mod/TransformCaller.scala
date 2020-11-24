package typings.babelCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransformCaller extends js.Object {
  
  // the only required property
  var name: String = js.native
  
  var supportsDynamicImport: js.UndefOr[Boolean] = js.native
  
  var supportsExportNamespaceFrom: js.UndefOr[Boolean] = js.native
  
  // e.g. set to true by `babel-loader` and false by `babel-jest`
  var supportsStaticESM: js.UndefOr[Boolean] = js.native
  
  var supportsTopLevelAwait: js.UndefOr[Boolean] = js.native
}
object TransformCaller {
  
  @scala.inline
  def apply(name: String): TransformCaller = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformCaller]
  }
  
  @scala.inline
  implicit class TransformCallerOps[Self <: TransformCaller] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsDynamicImport(value: Boolean): Self = this.set("supportsDynamicImport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsDynamicImport: Self = this.set("supportsDynamicImport", js.undefined)
    
    @scala.inline
    def setSupportsExportNamespaceFrom(value: Boolean): Self = this.set("supportsExportNamespaceFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsExportNamespaceFrom: Self = this.set("supportsExportNamespaceFrom", js.undefined)
    
    @scala.inline
    def setSupportsStaticESM(value: Boolean): Self = this.set("supportsStaticESM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsStaticESM: Self = this.set("supportsStaticESM", js.undefined)
    
    @scala.inline
    def setSupportsTopLevelAwait(value: Boolean): Self = this.set("supportsTopLevelAwait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSupportsTopLevelAwait: Self = this.set("supportsTopLevelAwait", js.undefined)
  }
}

package typings.babelCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransformCaller extends StObject {
  
  // the only required property
  var name: String
  
  var supportsDynamicImport: js.UndefOr[Boolean] = js.undefined
  
  var supportsExportNamespaceFrom: js.UndefOr[Boolean] = js.undefined
  
  // e.g. set to true by `babel-loader` and false by `babel-jest`
  var supportsStaticESM: js.UndefOr[Boolean] = js.undefined
  
  var supportsTopLevelAwait: js.UndefOr[Boolean] = js.undefined
}
object TransformCaller {
  
  @scala.inline
  def apply(name: String): TransformCaller = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransformCaller]
  }
  
  @scala.inline
  implicit class TransformCallerMutableBuilder[Self <: TransformCaller] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsDynamicImport(value: Boolean): Self = StObject.set(x, "supportsDynamicImport", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsDynamicImportUndefined: Self = StObject.set(x, "supportsDynamicImport", js.undefined)
    
    @scala.inline
    def setSupportsExportNamespaceFrom(value: Boolean): Self = StObject.set(x, "supportsExportNamespaceFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsExportNamespaceFromUndefined: Self = StObject.set(x, "supportsExportNamespaceFrom", js.undefined)
    
    @scala.inline
    def setSupportsStaticESM(value: Boolean): Self = StObject.set(x, "supportsStaticESM", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsStaticESMUndefined: Self = StObject.set(x, "supportsStaticESM", js.undefined)
    
    @scala.inline
    def setSupportsTopLevelAwait(value: Boolean): Self = StObject.set(x, "supportsTopLevelAwait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSupportsTopLevelAwaitUndefined: Self = StObject.set(x, "supportsTopLevelAwait", js.undefined)
  }
}

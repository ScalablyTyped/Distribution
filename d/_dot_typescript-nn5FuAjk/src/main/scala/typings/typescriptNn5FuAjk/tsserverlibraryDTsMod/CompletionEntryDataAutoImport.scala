package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import typings.typescriptNn5FuAjk.typescriptNn5FuAjkBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompletionEntryDataAutoImport extends StObject {
  
  /** The module name (with quotes stripped) of the export's module symbol, if it was an ambient module */
  var ambientModuleName: js.UndefOr[java.lang.String] = js.undefined
  
  /**
    * The name of the property or export in the module's symbol table. Differs from the completion name
    * in the case of InternalSymbolName.ExportEquals and InternalSymbolName.Default.
    */
  var exportName: java.lang.String
  
  /** The file name declaring the export's module symbol, if it was an external module */
  var fileName: js.UndefOr[java.lang.String] = js.undefined
  
  /** True if the export was found in the package.json AutoImportProvider */
  var isPackageJsonImport: js.UndefOr[`true`] = js.undefined
  
  var moduleSpecifier: js.UndefOr[java.lang.String] = js.undefined
}
object CompletionEntryDataAutoImport {
  
  inline def apply(exportName: java.lang.String): CompletionEntryDataAutoImport = {
    val __obj = js.Dynamic.literal(exportName = exportName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletionEntryDataAutoImport]
  }
  
  extension [Self <: CompletionEntryDataAutoImport](x: Self) {
    
    inline def setAmbientModuleName(value: java.lang.String): Self = StObject.set(x, "ambientModuleName", value.asInstanceOf[js.Any])
    
    inline def setAmbientModuleNameUndefined: Self = StObject.set(x, "ambientModuleName", js.undefined)
    
    inline def setExportName(value: java.lang.String): Self = StObject.set(x, "exportName", value.asInstanceOf[js.Any])
    
    inline def setFileName(value: java.lang.String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setFileNameUndefined: Self = StObject.set(x, "fileName", js.undefined)
    
    inline def setIsPackageJsonImport(value: `true`): Self = StObject.set(x, "isPackageJsonImport", value.asInstanceOf[js.Any])
    
    inline def setIsPackageJsonImportUndefined: Self = StObject.set(x, "isPackageJsonImport", js.undefined)
    
    inline def setModuleSpecifier(value: java.lang.String): Self = StObject.set(x, "moduleSpecifier", value.asInstanceOf[js.Any])
    
    inline def setModuleSpecifierUndefined: Self = StObject.set(x, "moduleSpecifier", js.undefined)
  }
}

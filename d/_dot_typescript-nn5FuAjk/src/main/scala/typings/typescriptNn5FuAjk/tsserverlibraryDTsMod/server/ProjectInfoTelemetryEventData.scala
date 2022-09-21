package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server

import typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.CompilerOptions
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.configured
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.external
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.jsconfigDotjson
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.other
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.tsconfigDotjson
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProjectInfoTelemetryEventData extends StObject {
  
  val compileOnSave: Boolean
  
  /**
    * Any compiler options that might contain paths will be taken out.
    * Enum compiler options will be converted to strings.
    */
  val compilerOptions: CompilerOptions
  
  val configFileName: tsconfigDotjson | jsconfigDotjson | other
  
  val exclude: js.UndefOr[Boolean] = js.undefined
  
  val `extends`: js.UndefOr[Boolean] = js.undefined
  
  /** Count of file extensions seen in the project. */
  val fileStats: FileStats
  
  val files: js.UndefOr[Boolean] = js.undefined
  
  val include: js.UndefOr[Boolean] = js.undefined
  
  val languageServiceEnabled: Boolean
  
  /** Cryptographically secure hash of project file location. */
  val projectId: String
  
  val projectType: external | configured
  
  val typeAcquisition: ProjectInfoTypeAcquisitionData
  
  /** TypeScript version used by the server. */
  val version: String
}
object ProjectInfoTelemetryEventData {
  
  inline def apply(
    compileOnSave: Boolean,
    compilerOptions: CompilerOptions,
    configFileName: tsconfigDotjson | jsconfigDotjson | other,
    fileStats: FileStats,
    languageServiceEnabled: Boolean,
    projectId: String,
    projectType: external | configured,
    typeAcquisition: ProjectInfoTypeAcquisitionData,
    version: String
  ): ProjectInfoTelemetryEventData = {
    val __obj = js.Dynamic.literal(compileOnSave = compileOnSave.asInstanceOf[js.Any], compilerOptions = compilerOptions.asInstanceOf[js.Any], configFileName = configFileName.asInstanceOf[js.Any], fileStats = fileStats.asInstanceOf[js.Any], languageServiceEnabled = languageServiceEnabled.asInstanceOf[js.Any], projectId = projectId.asInstanceOf[js.Any], projectType = projectType.asInstanceOf[js.Any], typeAcquisition = typeAcquisition.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectInfoTelemetryEventData]
  }
  
  extension [Self <: ProjectInfoTelemetryEventData](x: Self) {
    
    inline def setCompileOnSave(value: Boolean): Self = StObject.set(x, "compileOnSave", value.asInstanceOf[js.Any])
    
    inline def setCompilerOptions(value: CompilerOptions): Self = StObject.set(x, "compilerOptions", value.asInstanceOf[js.Any])
    
    inline def setConfigFileName(value: tsconfigDotjson | jsconfigDotjson | other): Self = StObject.set(x, "configFileName", value.asInstanceOf[js.Any])
    
    inline def setExclude(value: Boolean): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
    
    inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
    
    inline def setExtends(value: Boolean): Self = StObject.set(x, "extends", value.asInstanceOf[js.Any])
    
    inline def setExtendsUndefined: Self = StObject.set(x, "extends", js.undefined)
    
    inline def setFileStats(value: FileStats): Self = StObject.set(x, "fileStats", value.asInstanceOf[js.Any])
    
    inline def setFiles(value: Boolean): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
    
    inline def setInclude(value: Boolean): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
    
    inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
    
    inline def setLanguageServiceEnabled(value: Boolean): Self = StObject.set(x, "languageServiceEnabled", value.asInstanceOf[js.Any])
    
    inline def setProjectId(value: String): Self = StObject.set(x, "projectId", value.asInstanceOf[js.Any])
    
    inline def setProjectType(value: external | configured): Self = StObject.set(x, "projectType", value.asInstanceOf[js.Any])
    
    inline def setTypeAcquisition(value: ProjectInfoTypeAcquisitionData): Self = StObject.set(x, "typeAcquisition", value.asInstanceOf[js.Any])
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
  }
}

package typings.typescriptNn5FuAjk.protocolDTsMod.ts.server.protocol

import typings.typescriptNn5FuAjk.protocolDTsMod.ts.ScriptKind
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a file in external project.
  * External project is project whose set of files, compilation options and open\close state
  * is maintained by the client (i.e. if all this data come from .csproj file in Visual Studio).
  * External project will exist even if all files in it are closed and should be closed explicitly.
  * If external project includes one or more tsconfig.json/jsconfig.json files then tsserver will
  * create configured project for every config file but will maintain a link that these projects were created
  * as a result of opening external project so they should be removed once external project is closed.
  */
trait ExternalFile extends StObject {
  
  /**
    * Content of the file
    */
  var content: js.UndefOr[String] = js.undefined
  
  /**
    * Name of file file
    */
  var fileName: String
  
  /**
    * Whether file has mixed content (i.e. .cshtml file that combines html markup with C#/JavaScript)
    */
  var hasMixedContent: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Script kind of the file
    */
  var scriptKind: js.UndefOr[ScriptKindName | ScriptKind] = js.undefined
}
object ExternalFile {
  
  inline def apply(fileName: String): ExternalFile = {
    val __obj = js.Dynamic.literal(fileName = fileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExternalFile]
  }
  
  extension [Self <: ExternalFile](x: Self) {
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setFileName(value: String): Self = StObject.set(x, "fileName", value.asInstanceOf[js.Any])
    
    inline def setHasMixedContent(value: Boolean): Self = StObject.set(x, "hasMixedContent", value.asInstanceOf[js.Any])
    
    inline def setHasMixedContentUndefined: Self = StObject.set(x, "hasMixedContent", js.undefined)
    
    inline def setScriptKind(value: ScriptKindName | ScriptKind): Self = StObject.set(x, "scriptKind", value.asInstanceOf[js.Any])
    
    inline def setScriptKindUndefined: Self = StObject.set(x, "scriptKind", js.undefined)
  }
}

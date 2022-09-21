package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InlayHintsContext extends StObject {
  
  var cancellationToken: CancellationToken
  
  var file: SourceFile
  
  var host: LanguageServiceHost
  
  var preferences: UserPreferences
  
  var program: Program
  
  var span: TextSpan
}
object InlayHintsContext {
  
  inline def apply(
    cancellationToken: CancellationToken,
    file: SourceFile,
    host: LanguageServiceHost,
    preferences: UserPreferences,
    program: Program,
    span: TextSpan
  ): InlayHintsContext = {
    val __obj = js.Dynamic.literal(cancellationToken = cancellationToken.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], preferences = preferences.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], span = span.asInstanceOf[js.Any])
    __obj.asInstanceOf[InlayHintsContext]
  }
  
  extension [Self <: InlayHintsContext](x: Self) {
    
    inline def setCancellationToken(value: CancellationToken): Self = StObject.set(x, "cancellationToken", value.asInstanceOf[js.Any])
    
    inline def setFile(value: SourceFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setHost(value: LanguageServiceHost): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    inline def setPreferences(value: UserPreferences): Self = StObject.set(x, "preferences", value.asInstanceOf[js.Any])
    
    inline def setProgram(value: Program): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
    
    inline def setSpan(value: TextSpan): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
  }
}

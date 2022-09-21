package typings.typescriptNn5FuAjk.tsserverlibraryDTsMod.server.protocol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompileOnSaveMixin extends StObject {
  
  /**
    * If compile on save is enabled for the project
    */
  var compileOnSave: js.UndefOr[Boolean] = js.undefined
}
object CompileOnSaveMixin {
  
  inline def apply(): CompileOnSaveMixin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompileOnSaveMixin]
  }
  
  extension [Self <: CompileOnSaveMixin](x: Self) {
    
    inline def setCompileOnSave(value: Boolean): Self = StObject.set(x, "compileOnSave", value.asInstanceOf[js.Any])
    
    inline def setCompileOnSaveUndefined: Self = StObject.set(x, "compileOnSave", js.undefined)
  }
}

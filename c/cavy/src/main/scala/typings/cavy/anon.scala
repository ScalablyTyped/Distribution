package typings.cavy

import typings.cavy.mod.TestHookGenerator
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait GenerateTestHook extends StObject {
    
    var generateTestHook: TestHookGenerator
  }
  object GenerateTestHook {
    
    inline def apply(generateTestHook: TestHookGenerator): GenerateTestHook = {
      val __obj = js.Dynamic.literal(generateTestHook = generateTestHook.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateTestHook]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: GenerateTestHook] (val x: Self) extends AnyVal {
      
      inline def setGenerateTestHook(value: TestHookGenerator): Self = StObject.set(x, "generateTestHook", value.asInstanceOf[js.Any])
    }
  }
}

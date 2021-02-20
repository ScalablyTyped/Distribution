package typings.binaryParser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Choices extends StObject {
    
    var choices: /* import warning: importer.ImportType#apply Failed type conversion: infer C */ js.Any = js.native
  }
  object Choices {
    
    @scala.inline
    def apply(choices: /* import warning: importer.ImportType#apply Failed type conversion: infer C */ js.Any): Choices = {
      val __obj = js.Dynamic.literal(choices = choices.asInstanceOf[js.Any])
      __obj.asInstanceOf[Choices]
    }
    
    @scala.inline
    implicit class ChoicesMutableBuilder[Self <: Choices] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChoices(value: /* import warning: importer.ImportType#apply Failed type conversion: infer C */ js.Any): Self = StObject.set(x, "choices", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Type extends StObject {
    
    var `type`: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any = js.native
  }
  object Type {
    
    @scala.inline
    def apply(`type`: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any): Type = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}

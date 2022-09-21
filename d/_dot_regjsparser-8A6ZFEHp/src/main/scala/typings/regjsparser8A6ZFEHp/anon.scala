package typings.regjsparser8A6ZFEHp

import typings.regjsparser8A6ZFEHp.mod.Features
import typings.regjsparser8A6ZFEHp.mod.Identifier
import typings.regjsparser8A6ZFEHp.mod.RootNode
import typings.regjsparser8A6ZFEHp.regjsparser8A6ZFEHpStrings.normal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Behavior[F /* <: Features */] extends StObject {
    
    var behavior: normal
    
    var body: js.Array[RootNode[F]]
  }
  object Behavior {
    
    inline def apply[F /* <: Features */](body: js.Array[RootNode[F]]): Behavior[F] = {
      val __obj = js.Dynamic.literal(behavior = "normal", body = body.asInstanceOf[js.Any])
      __obj.asInstanceOf[Behavior[F]]
    }
    
    extension [Self <: Behavior[?], F /* <: Features */](x: Self & Behavior[F]) {
      
      inline def setBehavior(value: normal): Self = StObject.set(x, "behavior", value.asInstanceOf[js.Any])
      
      inline def setBody(value: js.Array[RootNode[F]]): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyVarargs(value: RootNode[F]*): Self = StObject.set(x, "body", js.Array(value*))
    }
  }
  
  trait Name extends StObject {
    
    var name: js.UndefOr[Identifier] = js.undefined
  }
  object Name {
    
    inline def apply(): Name = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: Identifier): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    }
  }
  
  trait NameUndefined extends StObject {
    
    var name: Unit
  }
  object NameUndefined {
    
    inline def apply(name: Unit): NameUndefined = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[NameUndefined]
    }
    
    extension [Self <: NameUndefined](x: Self) {
      
      inline def setName(value: Unit): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}

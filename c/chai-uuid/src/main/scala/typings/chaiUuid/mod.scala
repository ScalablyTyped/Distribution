package typings.chaiUuid

import org.scalablytyped.runtime.Shortcut
import typings.chai.Chai.ChaiPlugin
import typings.chai.Chai.LanguageChains
import typings.chai.Chai.NumericComparison
import typings.chai.Chai.TypeComparison
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("chai-uuid", JSImport.Namespace)
  @js.native
  val ^ : ChaiPlugin = js.native
  
  type _To = ChaiPlugin
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: ChaiPlugin = ^
  
  object global {
    
    object Chai {
      
      @js.native
      trait Assert extends StObject {
        
        def guid(guid: String): Unit = js.native
        def guid(guid: String, version: js.Any): Unit = js.native
        
        def uuid(uuid: String): Unit = js.native
        def uuid(uuid: String, version: UuidVersion): Unit = js.native
      }
      
      @js.native
      trait Assertion
        extends StObject
           with LanguageChains
           with NumericComparison
           with TypeComparison {
        
        def guid(): Unit = js.native
        def guid(guid: js.Any): Unit = js.native
        
        def uuid(): Unit = js.native
        def uuid(uuid: UuidVersion): Unit = js.native
      }
      
      /* Rewritten from type alias, can be one of: 
        - typings.chaiUuid.chaiUuidStrings.v1
        - typings.chaiUuid.chaiUuidStrings.v2
        - typings.chaiUuid.chaiUuidStrings.v3
        - typings.chaiUuid.chaiUuidStrings.v4
        - typings.chaiUuid.chaiUuidStrings.v5
        - typings.chaiUuid.chaiUuidStrings._empty
      */
      trait UuidVersion extends StObject
      object UuidVersion {
        
        inline def _empty: typings.chaiUuid.chaiUuidStrings._empty = "".asInstanceOf[typings.chaiUuid.chaiUuidStrings._empty]
        
        inline def v1: typings.chaiUuid.chaiUuidStrings.v1 = "v1".asInstanceOf[typings.chaiUuid.chaiUuidStrings.v1]
        
        inline def v2: typings.chaiUuid.chaiUuidStrings.v2 = "v2".asInstanceOf[typings.chaiUuid.chaiUuidStrings.v2]
        
        inline def v3: typings.chaiUuid.chaiUuidStrings.v3 = "v3".asInstanceOf[typings.chaiUuid.chaiUuidStrings.v3]
        
        inline def v4: typings.chaiUuid.chaiUuidStrings.v4 = "v4".asInstanceOf[typings.chaiUuid.chaiUuidStrings.v4]
        
        inline def v5: typings.chaiUuid.chaiUuidStrings.v5 = "v5".asInstanceOf[typings.chaiUuid.chaiUuidStrings.v5]
      }
    }
  }
}

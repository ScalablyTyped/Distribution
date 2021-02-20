package typings.chaiHttp

import typings.chaiHttp.mod.global.ChaiHttp.Agent
import typings.std.PromiseConstructorLike
import typings.std.RegExp
import typings.superagent.mod.SuperAgentStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("chai-http", JSImport.Namespace)
  @js.native
  def apply(chai: js.Any, utils: js.Any): Unit = js.native
  
  // Merge namespace with global chai
  object global {
    
    object Chai {
      
      @js.native
      trait Assertion extends StObject {
        
        def cookie(key: String): Assertion = js.native
        def cookie(key: String, value: String): Assertion = js.native
        
        def header(key: String): Assertion = js.native
        def header(key: String, value: String): Assertion = js.native
        def header(key: String, value: RegExp): Assertion = js.native
        
        var headers: Assertion = js.native
        
        var html: Assertion = js.native
        
        var json: Assertion = js.native
        
        def param(key: String): Assertion = js.native
        def param(key: String, value: String): Assertion = js.native
        
        var redirect: Assertion = js.native
        
        def redirectTo(location: String): Assertion = js.native
        def redirectTo(location: RegExp): Assertion = js.native
        
        def status(code: Double): Assertion = js.native
        
        def statusCode(code: Double): Assertion = js.native
        
        var text: Assertion = js.native
      }
      
      @js.native
      trait ChaiHttpRequest extends StObject {
        
        def apply(server: js.Any): Agent = js.native
        
        def addPromises(promiseConstructor: PromiseConstructorLike): Unit = js.native
        
        def agent(server: js.Any): Agent = js.native
      }
      
      @js.native
      trait ChaiStatic extends StObject {
        
        def request(server: js.Any): Agent = js.native
        @JSName("request")
        var request_Original: ChaiHttpRequest = js.native
      }
      
      @js.native
      trait TypeComparison extends StObject {
        
        var ip: Assertion = js.native
      }
      object TypeComparison {
        
        @scala.inline
        def apply(ip: Assertion): TypeComparison = {
          val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any])
          __obj.asInstanceOf[TypeComparison]
        }
        
        @scala.inline
        implicit class TypeComparisonMutableBuilder[Self <: TypeComparison] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setIp(value: Assertion): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
        }
      }
    }
    
    object ChaiHttp {
      
      @js.native
      trait Agent extends SuperAgentStatic {
        
        def close(): Agent = js.native
        def close(callback: js.Function1[/* err */ js.Any, Unit]): Agent = js.native
        
        def keepOpen(): Agent = js.native
      }
      
      type Response = typings.superagent.mod.Response
    }
  }
}

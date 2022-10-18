package typings.chaiHttp

import typings.chaiHttp.mod.global.ChaiHttp.Agent
import typings.std.PromiseConstructorLike
import typings.superagent.mod.SuperAgentStatic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(chai: Any, utils: Any): Unit = (^.asInstanceOf[js.Dynamic].apply(chai.asInstanceOf[js.Any], utils.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSImport("chai-http", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // Merge namespace with global chai
  object global {
    
    object Chai {
      
      @js.native
      trait Assertion extends StObject {
        
        def cookie(key: String): Assertion = js.native
        def cookie(key: String, value: String): Assertion = js.native
        
        def header(key: String): Assertion = js.native
        def header(key: String, value: String): Assertion = js.native
        def header(key: String, value: js.RegExp): Assertion = js.native
        
        var headers: Assertion = js.native
        
        var html: Assertion = js.native
        
        var json: Assertion = js.native
        
        def param(key: String): Assertion = js.native
        def param(key: String, value: String): Assertion = js.native
        
        var redirect: Assertion = js.native
        
        def redirectTo(location: String): Assertion = js.native
        def redirectTo(location: js.RegExp): Assertion = js.native
        
        def status(code: Double): Assertion = js.native
        
        def statusCode(code: Double): Assertion = js.native
        
        var text: Assertion = js.native
      }
      
      @js.native
      trait ChaiHttpRequest extends StObject {
        
        def apply(server: Any): Agent = js.native
        
        def addPromises(promiseConstructor: PromiseConstructorLike): Unit = js.native
        
        def agent(server: Any): Agent = js.native
      }
      
      trait ChaiStatic extends StObject {
        
        def request(server: Any): Agent
        @JSName("request")
        var request_Original: ChaiHttpRequest
      }
      object ChaiStatic {
        
        inline def apply(request: ChaiHttpRequest): ChaiStatic = {
          val __obj = js.Dynamic.literal(request = request.asInstanceOf[js.Any])
          __obj.asInstanceOf[ChaiStatic]
        }
        
        extension [Self <: ChaiStatic](x: Self) {
          
          inline def setRequest(value: ChaiHttpRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
        }
      }
      
      trait TypeComparison extends StObject {
        
        var ip: Assertion
      }
      object TypeComparison {
        
        inline def apply(ip: Assertion): TypeComparison = {
          val __obj = js.Dynamic.literal(ip = ip.asInstanceOf[js.Any])
          __obj.asInstanceOf[TypeComparison]
        }
        
        extension [Self <: TypeComparison](x: Self) {
          
          inline def setIp(value: Assertion): Self = StObject.set(x, "ip", value.asInstanceOf[js.Any])
        }
      }
    }
    
    object ChaiHttp {
      
      @js.native
      trait Agent
        extends StObject
           with SuperAgentStatic {
        
        def close(): Agent = js.native
        def close(callback: js.Function1[/* err */ Any, Unit]): Agent = js.native
        
        def keepOpen(): Agent = js.native
      }
      
      type Response = typings.superagent.mod.Response
    }
  }
}

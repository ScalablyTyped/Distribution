package typings.awsSdkSignatureV4

import typings.awsSdkTypes.httpMod.HttpRequest
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object suiteFixtureMod {
  
  object credentials {
    
    @JSImport("@aws-sdk/signature-v4/dist/cjs/suite.fixture", "credentials")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@aws-sdk/signature-v4/dist/cjs/suite.fixture", "credentials.accessKeyId")
    @js.native
    def accessKeyId: String = js.native
    @scala.inline
    def accessKeyId_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accessKeyId")(x.asInstanceOf[js.Any])
    
    @JSImport("@aws-sdk/signature-v4/dist/cjs/suite.fixture", "credentials.secretAccessKey")
    @js.native
    def secretAccessKey: String = js.native
    @scala.inline
    def secretAccessKey_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("secretAccessKey")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@aws-sdk/signature-v4/dist/cjs/suite.fixture", "region")
  @js.native
  val region: /* "us-east-1" */ String = js.native
  
  @JSImport("@aws-sdk/signature-v4/dist/cjs/suite.fixture", "requests")
  @js.native
  val requests: js.Array[TestCase] = js.native
  
  @JSImport("@aws-sdk/signature-v4/dist/cjs/suite.fixture", "service")
  @js.native
  val service: /* "service" */ String = js.native
  
  @JSImport("@aws-sdk/signature-v4/dist/cjs/suite.fixture", "signingDate")
  @js.native
  val signingDate: Date = js.native
  
  trait TestCase extends StObject {
    
    var authorization: String
    
    var name: String
    
    var request: HttpRequest
  }
  object TestCase {
    
    @scala.inline
    def apply(authorization: String, name: String, request: HttpRequest): TestCase = {
      val __obj = js.Dynamic.literal(authorization = authorization.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[TestCase]
    }
    
    @scala.inline
    implicit class TestCaseMutableBuilder[Self <: TestCase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthorization(value: String): Self = StObject.set(x, "authorization", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: HttpRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
}

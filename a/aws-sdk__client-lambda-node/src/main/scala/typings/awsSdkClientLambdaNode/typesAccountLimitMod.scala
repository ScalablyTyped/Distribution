package typings.awsSdkClientLambdaNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAccountLimitMod {
  
  trait AccountLimit extends StObject {
    
    /**
      * <p>Size, in bytes, of code/dependencies that you can zip into a deployment package (uncompressed zip/jar size) for uploading. The default limit is 250 MB.</p>
      */
    var CodeSizeUnzipped: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>Size, in bytes, of a single zipped code/dependencies package you can upload for your Lambda function(.zip/.jar file). Try using Amazon S3 for uploading larger files. Default limit is 50 MB.</p>
      */
    var CodeSizeZipped: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>Number of simultaneous executions of your function per region. The default limit is 1000.</p>
      */
    var ConcurrentExecutions: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>Maximum size, in bytes, of a code package you can upload per region. The default size is 75 GB. </p>
      */
    var TotalCodeSize: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The number of concurrent executions available to functions that do not have concurrency limits set. For more information, see <a href="http://docs.aws.amazon.com/lambda/latest/dg/concurrent-executions.html">Managing Concurrency</a>.</p>
      */
    var UnreservedConcurrentExecutions: js.UndefOr[Double] = js.undefined
  }
  object AccountLimit {
    
    inline def apply(): AccountLimit = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AccountLimit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AccountLimit] (val x: Self) extends AnyVal {
      
      inline def setCodeSizeUnzipped(value: Double): Self = StObject.set(x, "CodeSizeUnzipped", value.asInstanceOf[js.Any])
      
      inline def setCodeSizeUnzippedUndefined: Self = StObject.set(x, "CodeSizeUnzipped", js.undefined)
      
      inline def setCodeSizeZipped(value: Double): Self = StObject.set(x, "CodeSizeZipped", value.asInstanceOf[js.Any])
      
      inline def setCodeSizeZippedUndefined: Self = StObject.set(x, "CodeSizeZipped", js.undefined)
      
      inline def setConcurrentExecutions(value: Double): Self = StObject.set(x, "ConcurrentExecutions", value.asInstanceOf[js.Any])
      
      inline def setConcurrentExecutionsUndefined: Self = StObject.set(x, "ConcurrentExecutions", js.undefined)
      
      inline def setTotalCodeSize(value: Double): Self = StObject.set(x, "TotalCodeSize", value.asInstanceOf[js.Any])
      
      inline def setTotalCodeSizeUndefined: Self = StObject.set(x, "TotalCodeSize", js.undefined)
      
      inline def setUnreservedConcurrentExecutions(value: Double): Self = StObject.set(x, "UnreservedConcurrentExecutions", value.asInstanceOf[js.Any])
      
      inline def setUnreservedConcurrentExecutionsUndefined: Self = StObject.set(x, "UnreservedConcurrentExecutions", js.undefined)
    }
  }
  
  type UnmarshalledAccountLimit = AccountLimit
}

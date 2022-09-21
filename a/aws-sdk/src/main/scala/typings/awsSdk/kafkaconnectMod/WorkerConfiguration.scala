package typings.awsSdk.kafkaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkerConfiguration extends StObject {
  
  /**
    * The revision of the worker configuration.
    */
  var revision: longMin1
  
  /**
    * The Amazon Resource Name (ARN) of the worker configuration.
    */
  var workerConfigurationArn: string
}
object WorkerConfiguration {
  
  inline def apply(revision: longMin1, workerConfigurationArn: string): WorkerConfiguration = {
    val __obj = js.Dynamic.literal(revision = revision.asInstanceOf[js.Any], workerConfigurationArn = workerConfigurationArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkerConfiguration]
  }
  
  extension [Self <: WorkerConfiguration](x: Self) {
    
    inline def setRevision(value: longMin1): Self = StObject.set(x, "revision", value.asInstanceOf[js.Any])
    
    inline def setWorkerConfigurationArn(value: string): Self = StObject.set(x, "workerConfigurationArn", value.asInstanceOf[js.Any])
  }
}

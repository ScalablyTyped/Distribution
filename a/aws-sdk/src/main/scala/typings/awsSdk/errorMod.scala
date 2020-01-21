package typings.awsSdk

import typings.std.Date
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("aws-sdk/lib/error", JSImport.Namespace)
@js.native
object errorMod extends js.Object {
  @js.native
  class AWSError () extends Error {
    /**
      * CloudFront request ID associated with the response.
      */
    var cfId: String = js.native
    /**
      * A unique short code representing the error that was emitted.
      */
    var code: String = js.native
    /**
      * Second request ID associated with the response from S3.
      */
    var extendedRequestId: String = js.native
    /**
      * Set when a networking error occurs to easily identify the endpoint of the request.
      */
    var hostname: String = js.native
    /* CompleteClass */
    override var message: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    /**
      * Set when a networking error occurs to easily identify the region of the request.
      */
    var region: String = js.native
    /**
      * The unique request ID associated with the response.
      */
    var requestId: String = js.native
    /**
      * Amount of time (in seconds) that the request waited before being resent.
      */
    var retryDelay: Double = js.native
    /**
      * Whether the error message is retryable.
      */
    var retryable: Boolean = js.native
    /**
      * In the case of a request that reached the service, this value contains the response status code.
      */
    var statusCode: Double = js.native
    /**
      * The date time object when the error occurred.
      */
    var time: Date = js.native
  }
  
}


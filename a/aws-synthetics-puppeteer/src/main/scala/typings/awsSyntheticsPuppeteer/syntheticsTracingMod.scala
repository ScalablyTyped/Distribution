package typings.awsSyntheticsPuppeteer

import org.scalablytyped.runtime.Shortcut
import typings.node.httpMod.ClientRequest
import typings.node.httpMod.IncomingMessage
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object syntheticsTracingMod extends Shortcut {
  
  @JSImport("SyntheticsTracing", JSImport.Namespace)
  @js.native
  val ^ : SyntheticsTracing = js.native
  
  /**
    * The Synthetics Tracing Library for adding tracing to canaries.
    *
    * The primary behavior of this library is to facilitate the creation of traces
    * to aid in the debugging of canary run failures.
    * Traces can be seen in the CloudWatch ServiceLens ServiceMap.
    *
    */
  @js.native
  trait SyntheticsTracing extends StObject {
    
    var _activeTracing: Boolean = js.native
    
    var _awsXRayClient: Any = js.native
    
    var _awsXRaySDKClient: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof AWSXRaySDKClient */ Any = js.native
    
    var _canaryArn: Any = js.native
    
    var _canaryName: Any = js.native
    
    var _canaryRunId: Any = js.native
    
    var _executionError: Any = js.native
    
    var _segments: Map[Any, Any] = js.native
    
    var _xrayClientEndpoint: Any = js.native
    
    var _xrayClientRegion: Any = js.native
    
    var _xrayClientRoleArn: Any = js.native
    
    def activeTracing(): Boolean = js.native
    
    def addSegmentById(
      id: String,
      segment: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AWSXRaySDKClient.Segment */ Any
    ): Unit = js.native
    
    def appendCaptureAWSAllowlist(source: String): Unit = js.native
    def appendCaptureAWSAllowlist(source: js.Object): Unit = js.native
    
    /**
      * Configures the AWS SDK to automatically capture segment information
      * for each call made.
      * All created clients will automatically be captured.
      * To capture individual clients see 'captureAWSClient'
      * @param awssdk - The Javascript AWS SDK.
      * @returns awssdk that was passed in
      * @see https://github.com/aws/aws-sdk-js
      */
    def captureAWS[AWS](awssdk: AWS): AWS = js.native
    
    /**
      * Configures the AWS SDK client for the service specified
      * to automatically capture segment information for each call made
      * @param service - An instance of an AWS.Service to wrap.
      * @returns instrumented service that was passed in
      */
    def captureAWSClient[AWSClient](service: AWSClient): AWSClient = js.native
    
    /**
      * Wraps the http/https.request() and .get() calls to automatically capture information for the segment.
      * Returns an instance of the HTTP or HTTPS module that is patched.
      * @param module - The built in Node.js HTTP or HTTPS module.
      * @param downstreamXRayEnabled - when true, adds a "traced:true" property to the subsegment
      *   so the AWS X-Ray service expects a corresponding segment from the downstream service.
      * @param subsegmentCallback - a callback that is called with the subsegment, the Node.js
      *   http.ClientRequest, and the Node.js http.IncomingMessage to allow custom annotations and metadata
      *   to be added to the subsegment.
      * @returns the module that was passed in
      */
    def captureHTTPs(
      module: Any,
      downstreamXRayEnabled: Boolean,
      subsegmentCallback: js.Function4[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AWSXRaySDKClient.Subsegment */ /* subsegment */ Any, 
          /* request */ ClientRequest, 
          /* response */ js.UndefOr[IncomingMessage], 
          /* error */ js.UndefOr[js.Error], 
          Unit
        ]
    ): Any = js.native
    
    /**
      * Wraps the http/https.request() and .get() calls to automatically capture information for the segment.
      * This patches the built-in HTTP and HTTPS modules globally. If using a 3rd party HTTP library,
      * it should still use HTTP under the hood. Be sure to patch globally before requiring the 3rd party library.
      * 3rd party library compatibility is best effort. Some incompatibility issues may arise.
      * @param module - The built in Node.js HTTP or HTTPS module.
      * @param downstreamXRayEnabled - when true, adds a "traced:true" property to the subsegment
      *   so the AWS X-Ray service expects a corresponding segment from the downstream service.
      * @param subsegmentCallback - a callback that is called with the subsegment, the Node.js
      *   http.ClientRequest, the Node.js http.IncomingMessage (if a response was received) and any error issued,
      *   allowing custom annotations and metadata to be added to the subsegment.
      */
    def captureHTTPsGlobal(
      module: Any,
      downstreamXRayEnabled: Boolean,
      subsegmentCallback: js.Function4[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AWSXRaySDKClient.Subsegment */ /* subsegment */ Any, 
          /* request */ ClientRequest, 
          /* response */ js.UndefOr[IncomingMessage], 
          /* error */ js.UndefOr[js.Error], 
          Unit
        ]
    ): Unit = js.native
    
    /**
      * Closes the subsegment and its parent segment
      * Sends the subsegment and parent segment.
      *
      * Note: No further modification on the segment will be allowed.
      * The segment should already have added any annotations, metadata
      * Called addError, addErrorFlag, addThrottleFlag, and addFaultFlag
      * before making this call to close the segment.
      */
    def closeSubSegment(
      subsegment: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AWSXRaySDKClient.Subsegment */ Any
    ): Unit = js.native
    
    /**
      * Configures tracing source properties for canary name, canary arn, and canary run id
      *
      * canaryName: "canary-name",
      * canaryArn: "arn:aws:accountId:region:synthetics:canary:canary-name",
      * canaryRunId: "98203495-6546-2343-230203020102",
      *
      */
    def configureTracing(canaryName: String, canaryArn: String, canaryRunId: String): Unit = js.native
    
    /**
      * Creates an AWS.XRay client with the specified role arn, region, and endpoint
      *
      *  @param roleArn optional - IAM Role Arn to send traces to
      *     If roleArn is not specified, the current canary execution Role Arn
      *     will be used
      *  @param region optional - AWS SDK region to send traces to
      *     (e.g. "us-east-1")
      *     If region is not specified, the current region will be used
      *  @param endpoint optional - AWS X-Ray endpoint to send traces to
      *     (e.g. "https://xray.us-east-1.amazonaws.com/")
      *     If endpoint is not specified, the default endpoint for the region
      *     will be used
      *
      * returns - AWS.XRay client configured as specified
      */
    def createAWSXRayClient(): js.Promise[Any] = js.native
    def createAWSXRayClient(roleArn: String): js.Promise[Any] = js.native
    def createAWSXRayClient(roleArn: String, region: String): js.Promise[Any] = js.native
    def createAWSXRayClient(roleArn: String, region: String, endpoint: String): js.Promise[Any] = js.native
    def createAWSXRayClient(roleArn: String, region: Unit, endpoint: String): js.Promise[Any] = js.native
    def createAWSXRayClient(roleArn: Unit, region: String): js.Promise[Any] = js.native
    def createAWSXRayClient(roleArn: Unit, region: String, endpoint: String): js.Promise[Any] = js.native
    def createAWSXRayClient(roleArn: Unit, region: Unit, endpoint: String): js.Promise[Any] = js.native
    
    /**
      * Creates a new Segment and SubSegment that could be used for tracing a request/response
      * Keeps track of subsegments and segments created to be closed later.
      *
      * Configure Tracing before calling createSubSegment
      *
      * If activeTracing is false, this method returns null
      *
      * returns - SubSegment for a call that has a parent Segment with CloudWatch Synthetics canary annotations
      */
    def createSubSegment(name: String): Any = js.native
    
    /**
      * Configures the AWSXRaySDKClient with plugin AWS::CloudWatchSynthetics::Canary origin.
      * Used for creating new Segments and closing them
      *
      * canaryName - required
      * canaryArn - required
      * canaryRunId - required
      */
    def createXRaySDKClient(canaryName: Any, canaryArn: Any, canaryRunId: Any): js.Promise[Unit] = js.native
    
    /**
      * Returns an Amazon Trace Id (X-AMZN-TRACE-ID) formatted header for an existing segment
      * Sampled is set to true.
      */
    def getAmazonTraceIdHeader(
      segment: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AWSXRaySDKClient.Segment */ Any
    ): String = js.native
    
    def getExecutionError(): Any = js.native
    
    def getSegmentById(id: String): Any = js.native
    
    /**
      * Returns the open segment matching the traceHeader or null if there is no match
      */
    def getSubSegment(traceHeader: String): Any = js.native
    
    def logAndThrow(message: String, err: Any): Unit = js.native
    
    def removeSegmentById(id: String): Boolean = js.native
    
    /**
      * On Lambda warm starts, we might have the same NodeJS process running with this same instatiated class
      * already created.  Reset all the this._* variables that should be reset between Lambda invocations.
      */
    def reset(): js.Promise[Unit] = js.native
    
    def resetSegments(): Unit = js.native
    
    def sendTraceSegment(
      xRayClient: Any,
      segment: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AWSXRaySDKClient.Segment */ Any
    ): Unit = js.native
    
    def setActiveTracing(activeTracing: Boolean): js.Promise[Unit] = js.native
    
    def setCaptureAWSAllowlist(source: String): Unit = js.native
    def setCaptureAWSAllowlist(source: js.Object): Unit = js.native
    
    def setExecutionError(err: Any): Unit = js.native
    
    def setLogger(
      logger: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AWSXRaySDKClient.Logger */ Any
    ): Unit = js.native
    
    /**
      * Set the AWS X-Ray client configuration for role arn, region, and endpoint.
      * Useful for sending traces to a different account.
      * If the X-Ray client already exists, re-creates the X-Ray client in use.
      *
      *  @param roleArn optional - IAM Role Arn to send traces to
      *     If roleArn is not specified, the current canary execution Role Arn
      *     will be used
      *  @param region optional - AWS SDK region to send traces to
      *     (e.g. "us-east-1")
      *     If region is not specified, the current region will be used
      *  @param endpoint optional - AWS X-Ray endpoint to send traces to
      *     (e.g. "https://xray.us-east-1.amazonaws.com/")
      *     If endpoint is not specified, the default endpoint for the region
      *     will be used
      *
      */
    def setXRayClientConfiguration(): js.Promise[Unit] = js.native
    def setXRayClientConfiguration(roleArn: String): js.Promise[Unit] = js.native
    def setXRayClientConfiguration(roleArn: String, region: String): js.Promise[Unit] = js.native
    def setXRayClientConfiguration(roleArn: String, region: String, endpoint: String): js.Promise[Unit] = js.native
    def setXRayClientConfiguration(roleArn: String, region: Unit, endpoint: String): js.Promise[Unit] = js.native
    def setXRayClientConfiguration(roleArn: Unit, region: String): js.Promise[Unit] = js.native
    def setXRayClientConfiguration(roleArn: Unit, region: String, endpoint: String): js.Promise[Unit] = js.native
    def setXRayClientConfiguration(roleArn: Unit, region: Unit, endpoint: String): js.Promise[Unit] = js.native
  }
  
  type _To = SyntheticsTracing
  
  /* This means you don't have to write `^`, but can instead just say `syntheticsTracingMod.foo` */
  override def _to: SyntheticsTracing = ^
}

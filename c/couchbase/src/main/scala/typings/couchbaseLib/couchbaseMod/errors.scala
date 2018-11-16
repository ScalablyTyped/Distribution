package typings
package couchbaseLib.couchbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait errors extends js.Object

/**
 * Enumeration of all error codes. See libcouchbase documentation for more details on what these errors represent.
 */
@JSImport("couchbase", "errors")
@js.native
object errors extends js.Object {
  /** Authentication should continue. **/
  @js.native
  sealed trait authContinue
    extends couchbaseLib.couchbaseMod.errors
  
  /** Error authenticating. **/
  @js.native
  sealed trait authError
    extends couchbaseLib.couchbaseMod.errors
  
  /** A bad environment variable was specified. **/
  @js.native
  sealed trait badEnvironmentVariable
    extends couchbaseLib.couchbaseMod.errors
  
  /** A bad handle was passed. **/
  @js.native
  sealed trait badHandle
    extends couchbaseLib.couchbaseMod.errors
  
  /** The bucket you request was not found. **/
  @js.native
  sealed trait bukcketNotFound
    extends couchbaseLib.couchbaseMod.errors
  
  /** An unknown error occured within libcouchbase. **/
  @js.native
  sealed trait cLibGenericError
    extends couchbaseLib.couchbaseMod.errors
  
  /** Server is too busy to handle your request right now. **/
  @js.native
  sealed trait cLibInternal
    extends couchbaseLib.couchbaseMod.errors
  
  /** The server is out of memory. **/
  @js.native
  sealed trait cLibOutOfMemory
    extends couchbaseLib.couchbaseMod.errors
  
  /** An invalid arguement was passed. **/
  @js.native
  sealed trait cLinInvalidArgument
    extends couchbaseLib.couchbaseMod.errors
  
  /** Not all operations completed successfully. **/
  @js.native
  sealed trait checkResults
    extends couchbaseLib.couchbaseMod.errors
  
  /** libcouchbase is out of memory. **/
  @js.native
  sealed trait clientOutOfMemory
    extends couchbaseLib.couchbaseMod.errors
  
  /** A temporary error occured in libcouchbase. Try again. **/
  @js.native
  sealed trait clientTemporaryError
    extends couchbaseLib.couchbaseMod.errors
  
  /** Error connecting to the server. **/
  @js.native
  sealed trait connectError
    extends couchbaseLib.couchbaseMod.errors
  
  /** The passed incr/decr delta was invalid. **/
  @js.native
  sealed trait deltaBadVal
    extends couchbaseLib.couchbaseMod.errors
  
  /** Duplicate items. **/
  @js.native
  sealed trait duplicateItems
    extends couchbaseLib.couchbaseMod.errors
  
  /** The specified durability requirements could not be satisfied. **/
  @js.native
  sealed trait durabilityFailed
    extends couchbaseLib.couchbaseMod.errors
  
  /** Failed to find expected symbol in library. **/
  @js.native
  sealed trait failedToFindSymbol
    extends couchbaseLib.couchbaseMod.errors
  
  /** Failed to open library. **/
  @js.native
  sealed trait failedToOpenLibrary
    extends couchbaseLib.couchbaseMod.errors
  
  /** A generic error occured in Couchnode. **/
  @js.native
  sealed trait genericError
    extends couchbaseLib.couchbaseMod.errors
  
  /** Invalid arguements were passed. **/
  @js.native
  sealed trait invalidArguments
    extends couchbaseLib.couchbaseMod.errors
  
  /** The host format specified is invalid. **/
  @js.native
  sealed trait invalidHostFormat
    extends couchbaseLib.couchbaseMod.errors
  
  /** An invalid range was specified. **/
  @js.native
  sealed trait invalidRange
    extends couchbaseLib.couchbaseMod.errors
  
  /** The key already exists on the server. **/
  @js.native
  sealed trait keyAlreadyExists
    extends couchbaseLib.couchbaseMod.errors
  
  /** The key does not exist on the server. **/
  @js.native
  sealed trait keyNotFound
    extends couchbaseLib.couchbaseMod.errors
  
  /** A network error occured. **/
  @js.native
  sealed trait networkError
    extends couchbaseLib.couchbaseMod.errors
  
  /** Key mapping failed and could not match a server. **/
  @js.native
  sealed trait noMatchingServerForKey
    extends couchbaseLib.couchbaseMod.errors
  
  /**  Not enough nodes to meet the operations durability requirements. **/
  @js.native
  sealed trait notEnoughNodes
    extends couchbaseLib.couchbaseMod.errors
  
  /** Operations were performed on the incorrect server. **/
  @js.native
  sealed trait notMyVBucket
    extends couchbaseLib.couchbaseMod.errors
  
  /** The document was not stored. **/
  @js.native
  sealed trait notSorted
    extends couchbaseLib.couchbaseMod.errors
  
  /** An unsupported operation was sent to the server. **/
  @js.native
  sealed trait notSupported
    extends couchbaseLib.couchbaseMod.errors
  
  /** Object is too large to be stored on the cluster. **/
  @js.native
  sealed trait objectTooBig
    extends couchbaseLib.couchbaseMod.errors
  
  /** Couchnode is out of memory. **/
  @js.native
  sealed trait outOfMemory
    extends couchbaseLib.couchbaseMod.errors
  
  /** A protocol error occured. **/
  @js.native
  sealed trait protocolError
    extends couchbaseLib.couchbaseMod.errors
  
  /** An error occured during a RESTful operation. **/
  @js.native
  sealed trait restError
    extends couchbaseLib.couchbaseMod.errors
  
  /** An error occured while trying to schedule the operation. **/
  @js.native
  sealed trait schedulingError
    extends couchbaseLib.couchbaseMod.errors
  
  /** A server bug caused the operation to fail. **/
  @js.native
  sealed trait serverBug
    extends couchbaseLib.couchbaseMod.errors
  
  /** Operation was successful. **/
  @js.native
  sealed trait serverBusy
    extends couchbaseLib.couchbaseMod.errors
  
  /** Operation was successful. **/
  @js.native
  sealed trait success
    extends couchbaseLib.couchbaseMod.errors
  
  /** A temporary error occured. Try again. **/
  @js.native
  sealed trait temporaryError
    extends couchbaseLib.couchbaseMod.errors
  
  /** The operation timed out. **/
  @js.native
  sealed trait timedOut
    extends couchbaseLib.couchbaseMod.errors
  
  /** An unknown command was sent to the server. **/
  @js.native
  sealed trait unknownCommand
    extends couchbaseLib.couchbaseMod.errors
  
  /** An unknown host was specified. **/
  @js.native
  sealed trait unknownHost
    extends couchbaseLib.couchbaseMod.errors
  
  /** Operations were performed on the incorrect server. **/
  @js.native
  sealed trait wrongServer
    extends couchbaseLib.couchbaseMod.errors
  
  val authContinue: authContinue with java.lang.String = js.native
  val authError: authError with java.lang.String = js.native
  val badEnvironmentVariable: badEnvironmentVariable with java.lang.String = js.native
  val badHandle: badHandle with java.lang.String = js.native
  val bukcketNotFound: bukcketNotFound with java.lang.String = js.native
  val cLibGenericError: cLibGenericError with java.lang.String = js.native
  val cLibInternal: cLibInternal with java.lang.String = js.native
  val cLibOutOfMemory: cLibOutOfMemory with java.lang.String = js.native
  val cLinInvalidArgument: cLinInvalidArgument with java.lang.String = js.native
  val checkResults: checkResults with java.lang.String = js.native
  val clientOutOfMemory: clientOutOfMemory with java.lang.String = js.native
  val clientTemporaryError: clientTemporaryError with java.lang.String = js.native
  val connectError: connectError with java.lang.String = js.native
  val deltaBadVal: deltaBadVal with java.lang.String = js.native
  val duplicateItems: duplicateItems with java.lang.String = js.native
  val durabilityFailed: durabilityFailed with java.lang.String = js.native
  val failedToFindSymbol: failedToFindSymbol with java.lang.String = js.native
  val failedToOpenLibrary: failedToOpenLibrary with java.lang.String = js.native
  val genericError: genericError with java.lang.String = js.native
  val invalidArguments: invalidArguments with java.lang.String = js.native
  val invalidHostFormat: invalidHostFormat with java.lang.String = js.native
  val invalidRange: invalidRange with java.lang.String = js.native
  val keyAlreadyExists: keyAlreadyExists with java.lang.String = js.native
  val keyNotFound: keyNotFound with java.lang.String = js.native
  val networkError: networkError with java.lang.String = js.native
  val noMatchingServerForKey: noMatchingServerForKey with java.lang.String = js.native
  val notEnoughNodes: notEnoughNodes with java.lang.String = js.native
  val notMyVBucket: notMyVBucket with java.lang.String = js.native
  val notSorted: notSorted with java.lang.String = js.native
  val notSupported: notSupported with java.lang.String = js.native
  val objectTooBig: objectTooBig with java.lang.String = js.native
  val outOfMemory: outOfMemory with java.lang.String = js.native
  val protocolError: protocolError with java.lang.String = js.native
  val restError: restError with java.lang.String = js.native
  val schedulingError: schedulingError with java.lang.String = js.native
  val serverBug: serverBug with java.lang.String = js.native
  val serverBusy: serverBusy with java.lang.String = js.native
  val success: success with java.lang.String = js.native
  val temporaryError: temporaryError with java.lang.String = js.native
  val timedOut: timedOut with java.lang.String = js.native
  val unknownCommand: unknownCommand with java.lang.String = js.native
  val unknownHost: unknownHost with java.lang.String = js.native
  val wrongServer: wrongServer with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[couchbaseLib.couchbaseMod.errors with java.lang.String] = js.native
}


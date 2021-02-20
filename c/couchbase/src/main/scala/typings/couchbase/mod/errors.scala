package typings.couchbase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait errors extends StObject
/**
  * Enumeration of all error codes. See libcouchbase documentation for more details on what these errors represent.
  */
@JSImport("couchbase", "errors")
@js.native
object errors extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[errors with Double] = js.native
  
  /** Authentication should continue. **/
  @js.native
  sealed trait authContinue extends errors
  /* 1 */ val authContinue: typings.couchbase.mod.errors.authContinue with Double = js.native
  
  /** Error authenticating. **/
  @js.native
  sealed trait authError extends errors
  /* 2 */ val authError: typings.couchbase.mod.errors.authError with Double = js.native
  
  /** A bad environment variable was specified. **/
  @js.native
  sealed trait badEnvironmentVariable extends errors
  /* 35 */ val badEnvironmentVariable: typings.couchbase.mod.errors.badEnvironmentVariable with Double = js.native
  
  /** A bad handle was passed. **/
  @js.native
  sealed trait badHandle extends errors
  /* 29 */ val badHandle: typings.couchbase.mod.errors.badHandle with Double = js.native
  
  /** The bucket you request was not found. **/
  @js.native
  sealed trait bukcketNotFound extends errors
  /* 26 */ val bukcketNotFound: typings.couchbase.mod.errors.bukcketNotFound with Double = js.native
  
  /** An unknown error occured within libcouchbase. **/
  @js.native
  sealed trait cLibGenericError extends errors
  /* 10 */ val cLibGenericError: typings.couchbase.mod.errors.cLibGenericError with Double = js.native
  
  /** Server is too busy to handle your request right now. **/
  @js.native
  sealed trait cLibInternal extends errors
  /* 6 */ val cLibInternal: typings.couchbase.mod.errors.cLibInternal with Double = js.native
  
  /** The server is out of memory. **/
  @js.native
  sealed trait cLibOutOfMemory extends errors
  /* 8 */ val cLibOutOfMemory: typings.couchbase.mod.errors.cLibOutOfMemory with Double = js.native
  
  /** An invalid arguement was passed. **/
  @js.native
  sealed trait cLinInvalidArgument extends errors
  /* 7 */ val cLinInvalidArgument: typings.couchbase.mod.errors.cLinInvalidArgument with Double = js.native
  
  /** Not all operations completed successfully. **/
  @js.native
  sealed trait checkResults extends errors
  /* 39 */ val checkResults: typings.couchbase.mod.errors.checkResults with Double = js.native
  
  /** libcouchbase is out of memory. **/
  @js.native
  sealed trait clientOutOfMemory extends errors
  /* 27 */ val clientOutOfMemory: typings.couchbase.mod.errors.clientOutOfMemory with Double = js.native
  
  /** A temporary error occured in libcouchbase. Try again. **/
  @js.native
  sealed trait clientTemporaryError extends errors
  /* 28 */ val clientTemporaryError: typings.couchbase.mod.errors.clientTemporaryError with Double = js.native
  
  /** Error connecting to the server. **/
  @js.native
  sealed trait connectError extends errors
  /* 25 */ val connectError: typings.couchbase.mod.errors.connectError with Double = js.native
  
  /** The passed incr/decr delta was invalid. **/
  @js.native
  sealed trait deltaBadVal extends errors
  /* 3 */ val deltaBadVal: typings.couchbase.mod.errors.deltaBadVal with Double = js.native
  
  /** Duplicate items. **/
  @js.native
  sealed trait duplicateItems extends errors
  /* 33 */ val duplicateItems: typings.couchbase.mod.errors.duplicateItems with Double = js.native
  
  /** The specified durability requirements could not be satisfied. **/
  @js.native
  sealed trait durabilityFailed extends errors
  /* 41 */ val durabilityFailed: typings.couchbase.mod.errors.durabilityFailed with Double = js.native
  
  /** Failed to find expected symbol in library. **/
  @js.native
  sealed trait failedToFindSymbol extends errors
  /* 15 */ val failedToFindSymbol: typings.couchbase.mod.errors.failedToFindSymbol with Double = js.native
  
  /** Failed to open library. **/
  @js.native
  sealed trait failedToOpenLibrary extends errors
  /* 14 */ val failedToOpenLibrary: typings.couchbase.mod.errors.failedToOpenLibrary with Double = js.native
  
  /** A generic error occured in Couchnode. **/
  @js.native
  sealed trait genericError extends errors
  /* 40 */ val genericError: typings.couchbase.mod.errors.genericError with Double = js.native
  
  /** Invalid arguements were passed. **/
  @js.native
  sealed trait invalidArguments extends errors
  /* 37 */ val invalidArguments: typings.couchbase.mod.errors.invalidArguments with Double = js.native
  
  /** The host format specified is invalid. **/
  @js.native
  sealed trait invalidHostFormat extends errors
  /* 31 */ val invalidHostFormat: typings.couchbase.mod.errors.invalidHostFormat with Double = js.native
  
  /** An invalid range was specified. **/
  @js.native
  sealed trait invalidRange extends errors
  /* 9 */ val invalidRange: typings.couchbase.mod.errors.invalidRange with Double = js.native
  
  /** The key already exists on the server. **/
  @js.native
  sealed trait keyAlreadyExists extends errors
  /* 12 */ val keyAlreadyExists: typings.couchbase.mod.errors.keyAlreadyExists with Double = js.native
  
  /** The key does not exist on the server. **/
  @js.native
  sealed trait keyNotFound extends errors
  /* 13 */ val keyNotFound: typings.couchbase.mod.errors.keyNotFound with Double = js.native
  
  /** A network error occured. **/
  @js.native
  sealed trait networkError extends errors
  /* 16 */ val networkError: typings.couchbase.mod.errors.networkError with Double = js.native
  
  /** Key mapping failed and could not match a server. **/
  @js.native
  sealed trait noMatchingServerForKey extends errors
  /* 34 */ val noMatchingServerForKey: typings.couchbase.mod.errors.noMatchingServerForKey with Double = js.native
  
  /**  Not enough nodes to meet the operations durability requirements. **/
  @js.native
  sealed trait notEnoughNodes extends errors
  /* 32 */ val notEnoughNodes: typings.couchbase.mod.errors.notEnoughNodes with Double = js.native
  
  /** Operations were performed on the incorrect server. **/
  @js.native
  sealed trait notMyVBucket extends errors
  /* 18 */ val notMyVBucket: typings.couchbase.mod.errors.notMyVBucket with Double = js.native
  
  /** The document was not stored. **/
  @js.native
  sealed trait notSorted extends errors
  /* 19 */ val notSorted: typings.couchbase.mod.errors.notSorted with Double = js.native
  
  /** An unsupported operation was sent to the server. **/
  @js.native
  sealed trait notSupported extends errors
  /* 20 */ val notSupported: typings.couchbase.mod.errors.notSupported with Double = js.native
  
  /** Object is too large to be stored on the cluster. **/
  @js.native
  sealed trait objectTooBig extends errors
  /* 4 */ val objectTooBig: typings.couchbase.mod.errors.objectTooBig with Double = js.native
  
  /** Couchnode is out of memory. **/
  @js.native
  sealed trait outOfMemory extends errors
  /* 36 */ val outOfMemory: typings.couchbase.mod.errors.outOfMemory with Double = js.native
  
  /** A protocol error occured. **/
  @js.native
  sealed trait protocolError extends errors
  /* 23 */ val protocolError: typings.couchbase.mod.errors.protocolError with Double = js.native
  
  /** An error occured during a RESTful operation. **/
  @js.native
  sealed trait restError extends errors
  /* 42 */ val restError: typings.couchbase.mod.errors.restError with Double = js.native
  
  /** An error occured while trying to schedule the operation. **/
  @js.native
  sealed trait schedulingError extends errors
  /* 38 */ val schedulingError: typings.couchbase.mod.errors.schedulingError with Double = js.native
  
  /** A server bug caused the operation to fail. **/
  @js.native
  sealed trait serverBug extends errors
  /* 30 */ val serverBug: typings.couchbase.mod.errors.serverBug with Double = js.native
  
  /** Operation was successful. **/
  @js.native
  sealed trait serverBusy extends errors
  /* 5 */ val serverBusy: typings.couchbase.mod.errors.serverBusy with Double = js.native
  
  /** Operation was successful. **/
  @js.native
  sealed trait success extends errors
  /* 0 */ val success: typings.couchbase.mod.errors.success with Double = js.native
  
  /** A temporary error occured. Try again. **/
  @js.native
  sealed trait temporaryError extends errors
  /* 11 */ val temporaryError: typings.couchbase.mod.errors.temporaryError with Double = js.native
  
  /** The operation timed out. **/
  @js.native
  sealed trait timedOut extends errors
  /* 24 */ val timedOut: typings.couchbase.mod.errors.timedOut with Double = js.native
  
  /** An unknown command was sent to the server. **/
  @js.native
  sealed trait unknownCommand extends errors
  /* 21 */ val unknownCommand: typings.couchbase.mod.errors.unknownCommand with Double = js.native
  
  /** An unknown host was specified. **/
  @js.native
  sealed trait unknownHost extends errors
  /* 22 */ val unknownHost: typings.couchbase.mod.errors.unknownHost with Double = js.native
  
  /** Operations were performed on the incorrect server. **/
  @js.native
  sealed trait wrongServer extends errors
  /* 17 */ val wrongServer: typings.couchbase.mod.errors.wrongServer with Double = js.native
}

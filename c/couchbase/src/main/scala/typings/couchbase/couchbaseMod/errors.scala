package typings.couchbase.couchbaseMod

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
  sealed trait authContinue extends errors
  
  /** Error authenticating. **/
  @js.native
  sealed trait authError extends errors
  
  /** A bad environment variable was specified. **/
  @js.native
  sealed trait badEnvironmentVariable extends errors
  
  /** A bad handle was passed. **/
  @js.native
  sealed trait badHandle extends errors
  
  /** The bucket you request was not found. **/
  @js.native
  sealed trait bukcketNotFound extends errors
  
  /** An unknown error occured within libcouchbase. **/
  @js.native
  sealed trait cLibGenericError extends errors
  
  /** Server is too busy to handle your request right now. **/
  @js.native
  sealed trait cLibInternal extends errors
  
  /** The server is out of memory. **/
  @js.native
  sealed trait cLibOutOfMemory extends errors
  
  /** An invalid arguement was passed. **/
  @js.native
  sealed trait cLinInvalidArgument extends errors
  
  /** Not all operations completed successfully. **/
  @js.native
  sealed trait checkResults extends errors
  
  /** libcouchbase is out of memory. **/
  @js.native
  sealed trait clientOutOfMemory extends errors
  
  /** A temporary error occured in libcouchbase. Try again. **/
  @js.native
  sealed trait clientTemporaryError extends errors
  
  /** Error connecting to the server. **/
  @js.native
  sealed trait connectError extends errors
  
  /** The passed incr/decr delta was invalid. **/
  @js.native
  sealed trait deltaBadVal extends errors
  
  /** Duplicate items. **/
  @js.native
  sealed trait duplicateItems extends errors
  
  /** The specified durability requirements could not be satisfied. **/
  @js.native
  sealed trait durabilityFailed extends errors
  
  /** Failed to find expected symbol in library. **/
  @js.native
  sealed trait failedToFindSymbol extends errors
  
  /** Failed to open library. **/
  @js.native
  sealed trait failedToOpenLibrary extends errors
  
  /** A generic error occured in Couchnode. **/
  @js.native
  sealed trait genericError extends errors
  
  /** Invalid arguements were passed. **/
  @js.native
  sealed trait invalidArguments extends errors
  
  /** The host format specified is invalid. **/
  @js.native
  sealed trait invalidHostFormat extends errors
  
  /** An invalid range was specified. **/
  @js.native
  sealed trait invalidRange extends errors
  
  /** The key already exists on the server. **/
  @js.native
  sealed trait keyAlreadyExists extends errors
  
  /** The key does not exist on the server. **/
  @js.native
  sealed trait keyNotFound extends errors
  
  /** A network error occured. **/
  @js.native
  sealed trait networkError extends errors
  
  /** Key mapping failed and could not match a server. **/
  @js.native
  sealed trait noMatchingServerForKey extends errors
  
  /**  Not enough nodes to meet the operations durability requirements. **/
  @js.native
  sealed trait notEnoughNodes extends errors
  
  /** Operations were performed on the incorrect server. **/
  @js.native
  sealed trait notMyVBucket extends errors
  
  /** The document was not stored. **/
  @js.native
  sealed trait notSorted extends errors
  
  /** An unsupported operation was sent to the server. **/
  @js.native
  sealed trait notSupported extends errors
  
  /** Object is too large to be stored on the cluster. **/
  @js.native
  sealed trait objectTooBig extends errors
  
  /** Couchnode is out of memory. **/
  @js.native
  sealed trait outOfMemory extends errors
  
  /** A protocol error occured. **/
  @js.native
  sealed trait protocolError extends errors
  
  /** An error occured during a RESTful operation. **/
  @js.native
  sealed trait restError extends errors
  
  /** An error occured while trying to schedule the operation. **/
  @js.native
  sealed trait schedulingError extends errors
  
  /** A server bug caused the operation to fail. **/
  @js.native
  sealed trait serverBug extends errors
  
  /** Operation was successful. **/
  @js.native
  sealed trait serverBusy extends errors
  
  /** Operation was successful. **/
  @js.native
  sealed trait success extends errors
  
  /** A temporary error occured. Try again. **/
  @js.native
  sealed trait temporaryError extends errors
  
  /** The operation timed out. **/
  @js.native
  sealed trait timedOut extends errors
  
  /** An unknown command was sent to the server. **/
  @js.native
  sealed trait unknownCommand extends errors
  
  /** An unknown host was specified. **/
  @js.native
  sealed trait unknownHost extends errors
  
  /** Operations were performed on the incorrect server. **/
  @js.native
  sealed trait wrongServer extends errors
  
  /* 1 */ val authContinue: typings.couchbase.couchbaseMod.errors.authContinue with Double = js.native
  /* 2 */ val authError: typings.couchbase.couchbaseMod.errors.authError with Double = js.native
  /* 35 */ val badEnvironmentVariable: typings.couchbase.couchbaseMod.errors.badEnvironmentVariable with Double = js.native
  /* 29 */ val badHandle: typings.couchbase.couchbaseMod.errors.badHandle with Double = js.native
  /* 26 */ val bukcketNotFound: typings.couchbase.couchbaseMod.errors.bukcketNotFound with Double = js.native
  /* 10 */ val cLibGenericError: typings.couchbase.couchbaseMod.errors.cLibGenericError with Double = js.native
  /* 6 */ val cLibInternal: typings.couchbase.couchbaseMod.errors.cLibInternal with Double = js.native
  /* 8 */ val cLibOutOfMemory: typings.couchbase.couchbaseMod.errors.cLibOutOfMemory with Double = js.native
  /* 7 */ val cLinInvalidArgument: typings.couchbase.couchbaseMod.errors.cLinInvalidArgument with Double = js.native
  /* 39 */ val checkResults: typings.couchbase.couchbaseMod.errors.checkResults with Double = js.native
  /* 27 */ val clientOutOfMemory: typings.couchbase.couchbaseMod.errors.clientOutOfMemory with Double = js.native
  /* 28 */ val clientTemporaryError: typings.couchbase.couchbaseMod.errors.clientTemporaryError with Double = js.native
  /* 25 */ val connectError: typings.couchbase.couchbaseMod.errors.connectError with Double = js.native
  /* 3 */ val deltaBadVal: typings.couchbase.couchbaseMod.errors.deltaBadVal with Double = js.native
  /* 33 */ val duplicateItems: typings.couchbase.couchbaseMod.errors.duplicateItems with Double = js.native
  /* 41 */ val durabilityFailed: typings.couchbase.couchbaseMod.errors.durabilityFailed with Double = js.native
  /* 15 */ val failedToFindSymbol: typings.couchbase.couchbaseMod.errors.failedToFindSymbol with Double = js.native
  /* 14 */ val failedToOpenLibrary: typings.couchbase.couchbaseMod.errors.failedToOpenLibrary with Double = js.native
  /* 40 */ val genericError: typings.couchbase.couchbaseMod.errors.genericError with Double = js.native
  /* 37 */ val invalidArguments: typings.couchbase.couchbaseMod.errors.invalidArguments with Double = js.native
  /* 31 */ val invalidHostFormat: typings.couchbase.couchbaseMod.errors.invalidHostFormat with Double = js.native
  /* 9 */ val invalidRange: typings.couchbase.couchbaseMod.errors.invalidRange with Double = js.native
  /* 12 */ val keyAlreadyExists: typings.couchbase.couchbaseMod.errors.keyAlreadyExists with Double = js.native
  /* 13 */ val keyNotFound: typings.couchbase.couchbaseMod.errors.keyNotFound with Double = js.native
  /* 16 */ val networkError: typings.couchbase.couchbaseMod.errors.networkError with Double = js.native
  /* 34 */ val noMatchingServerForKey: typings.couchbase.couchbaseMod.errors.noMatchingServerForKey with Double = js.native
  /* 32 */ val notEnoughNodes: typings.couchbase.couchbaseMod.errors.notEnoughNodes with Double = js.native
  /* 18 */ val notMyVBucket: typings.couchbase.couchbaseMod.errors.notMyVBucket with Double = js.native
  /* 19 */ val notSorted: typings.couchbase.couchbaseMod.errors.notSorted with Double = js.native
  /* 20 */ val notSupported: typings.couchbase.couchbaseMod.errors.notSupported with Double = js.native
  /* 4 */ val objectTooBig: typings.couchbase.couchbaseMod.errors.objectTooBig with Double = js.native
  /* 36 */ val outOfMemory: typings.couchbase.couchbaseMod.errors.outOfMemory with Double = js.native
  /* 23 */ val protocolError: typings.couchbase.couchbaseMod.errors.protocolError with Double = js.native
  /* 42 */ val restError: typings.couchbase.couchbaseMod.errors.restError with Double = js.native
  /* 38 */ val schedulingError: typings.couchbase.couchbaseMod.errors.schedulingError with Double = js.native
  /* 30 */ val serverBug: typings.couchbase.couchbaseMod.errors.serverBug with Double = js.native
  /* 5 */ val serverBusy: typings.couchbase.couchbaseMod.errors.serverBusy with Double = js.native
  /* 0 */ val success: typings.couchbase.couchbaseMod.errors.success with Double = js.native
  /* 11 */ val temporaryError: typings.couchbase.couchbaseMod.errors.temporaryError with Double = js.native
  /* 24 */ val timedOut: typings.couchbase.couchbaseMod.errors.timedOut with Double = js.native
  /* 21 */ val unknownCommand: typings.couchbase.couchbaseMod.errors.unknownCommand with Double = js.native
  /* 22 */ val unknownHost: typings.couchbase.couchbaseMod.errors.unknownHost with Double = js.native
  /* 17 */ val wrongServer: typings.couchbase.couchbaseMod.errors.wrongServer with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[errors with Double] = js.native
}


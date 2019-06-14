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
  
  /* 1 */ val authContinue: authContinue with scala.Double = js.native
  /* 2 */ val authError: authError with scala.Double = js.native
  /* 35 */ val badEnvironmentVariable: badEnvironmentVariable with scala.Double = js.native
  /* 29 */ val badHandle: badHandle with scala.Double = js.native
  /* 26 */ val bukcketNotFound: bukcketNotFound with scala.Double = js.native
  /* 10 */ val cLibGenericError: cLibGenericError with scala.Double = js.native
  /* 6 */ val cLibInternal: cLibInternal with scala.Double = js.native
  /* 8 */ val cLibOutOfMemory: cLibOutOfMemory with scala.Double = js.native
  /* 7 */ val cLinInvalidArgument: cLinInvalidArgument with scala.Double = js.native
  /* 39 */ val checkResults: checkResults with scala.Double = js.native
  /* 27 */ val clientOutOfMemory: clientOutOfMemory with scala.Double = js.native
  /* 28 */ val clientTemporaryError: clientTemporaryError with scala.Double = js.native
  /* 25 */ val connectError: connectError with scala.Double = js.native
  /* 3 */ val deltaBadVal: deltaBadVal with scala.Double = js.native
  /* 33 */ val duplicateItems: duplicateItems with scala.Double = js.native
  /* 41 */ val durabilityFailed: durabilityFailed with scala.Double = js.native
  /* 15 */ val failedToFindSymbol: failedToFindSymbol with scala.Double = js.native
  /* 14 */ val failedToOpenLibrary: failedToOpenLibrary with scala.Double = js.native
  /* 40 */ val genericError: genericError with scala.Double = js.native
  /* 37 */ val invalidArguments: invalidArguments with scala.Double = js.native
  /* 31 */ val invalidHostFormat: invalidHostFormat with scala.Double = js.native
  /* 9 */ val invalidRange: invalidRange with scala.Double = js.native
  /* 12 */ val keyAlreadyExists: keyAlreadyExists with scala.Double = js.native
  /* 13 */ val keyNotFound: keyNotFound with scala.Double = js.native
  /* 16 */ val networkError: networkError with scala.Double = js.native
  /* 34 */ val noMatchingServerForKey: noMatchingServerForKey with scala.Double = js.native
  /* 32 */ val notEnoughNodes: notEnoughNodes with scala.Double = js.native
  /* 18 */ val notMyVBucket: notMyVBucket with scala.Double = js.native
  /* 19 */ val notSorted: notSorted with scala.Double = js.native
  /* 20 */ val notSupported: notSupported with scala.Double = js.native
  /* 4 */ val objectTooBig: objectTooBig with scala.Double = js.native
  /* 36 */ val outOfMemory: outOfMemory with scala.Double = js.native
  /* 23 */ val protocolError: protocolError with scala.Double = js.native
  /* 42 */ val restError: restError with scala.Double = js.native
  /* 38 */ val schedulingError: schedulingError with scala.Double = js.native
  /* 30 */ val serverBug: serverBug with scala.Double = js.native
  /* 5 */ val serverBusy: serverBusy with scala.Double = js.native
  /* 0 */ val success: success with scala.Double = js.native
  /* 11 */ val temporaryError: temporaryError with scala.Double = js.native
  /* 24 */ val timedOut: timedOut with scala.Double = js.native
  /* 21 */ val unknownCommand: unknownCommand with scala.Double = js.native
  /* 22 */ val unknownHost: unknownHost with scala.Double = js.native
  /* 17 */ val wrongServer: wrongServer with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[couchbaseLib.couchbaseMod.errors with scala.Double] = js.native
}


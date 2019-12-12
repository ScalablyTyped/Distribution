package typings.couchbase.couchbaseMod

import org.scalablytyped.runtime.TopLevel
import typings.couchbase.couchbaseMod.errors.authContinue
import typings.couchbase.couchbaseMod.errors.authError
import typings.couchbase.couchbaseMod.errors.badEnvironmentVariable
import typings.couchbase.couchbaseMod.errors.badHandle
import typings.couchbase.couchbaseMod.errors.bukcketNotFound
import typings.couchbase.couchbaseMod.errors.cLibGenericError
import typings.couchbase.couchbaseMod.errors.cLibInternal
import typings.couchbase.couchbaseMod.errors.cLibOutOfMemory
import typings.couchbase.couchbaseMod.errors.cLinInvalidArgument
import typings.couchbase.couchbaseMod.errors.checkResults
import typings.couchbase.couchbaseMod.errors.clientOutOfMemory
import typings.couchbase.couchbaseMod.errors.clientTemporaryError
import typings.couchbase.couchbaseMod.errors.connectError
import typings.couchbase.couchbaseMod.errors.deltaBadVal
import typings.couchbase.couchbaseMod.errors.duplicateItems
import typings.couchbase.couchbaseMod.errors.durabilityFailed
import typings.couchbase.couchbaseMod.errors.failedToFindSymbol
import typings.couchbase.couchbaseMod.errors.failedToOpenLibrary
import typings.couchbase.couchbaseMod.errors.genericError
import typings.couchbase.couchbaseMod.errors.invalidArguments
import typings.couchbase.couchbaseMod.errors.invalidHostFormat
import typings.couchbase.couchbaseMod.errors.invalidRange
import typings.couchbase.couchbaseMod.errors.keyAlreadyExists
import typings.couchbase.couchbaseMod.errors.keyNotFound
import typings.couchbase.couchbaseMod.errors.networkError
import typings.couchbase.couchbaseMod.errors.noMatchingServerForKey
import typings.couchbase.couchbaseMod.errors.notEnoughNodes
import typings.couchbase.couchbaseMod.errors.notMyVBucket
import typings.couchbase.couchbaseMod.errors.notSorted
import typings.couchbase.couchbaseMod.errors.notSupported
import typings.couchbase.couchbaseMod.errors.objectTooBig
import typings.couchbase.couchbaseMod.errors.outOfMemory
import typings.couchbase.couchbaseMod.errors.protocolError
import typings.couchbase.couchbaseMod.errors.restError
import typings.couchbase.couchbaseMod.errors.schedulingError
import typings.couchbase.couchbaseMod.errors.serverBug
import typings.couchbase.couchbaseMod.errors.serverBusy
import typings.couchbase.couchbaseMod.errors.success
import typings.couchbase.couchbaseMod.errors.temporaryError
import typings.couchbase.couchbaseMod.errors.timedOut
import typings.couchbase.couchbaseMod.errors.unknownCommand
import typings.couchbase.couchbaseMod.errors.unknownHost
import typings.couchbase.couchbaseMod.errors.wrongServer
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[errors with Double] = js.native
  /* 1 */ @js.native
  object authContinue extends TopLevel[authContinue with Double]
  
  /* 2 */ @js.native
  object authError extends TopLevel[authError with Double]
  
  /* 35 */ @js.native
  object badEnvironmentVariable extends TopLevel[badEnvironmentVariable with Double]
  
  /* 29 */ @js.native
  object badHandle extends TopLevel[badHandle with Double]
  
  /* 26 */ @js.native
  object bukcketNotFound extends TopLevel[bukcketNotFound with Double]
  
  /* 10 */ @js.native
  object cLibGenericError extends TopLevel[cLibGenericError with Double]
  
  /* 6 */ @js.native
  object cLibInternal extends TopLevel[cLibInternal with Double]
  
  /* 8 */ @js.native
  object cLibOutOfMemory extends TopLevel[cLibOutOfMemory with Double]
  
  /* 7 */ @js.native
  object cLinInvalidArgument extends TopLevel[cLinInvalidArgument with Double]
  
  /* 39 */ @js.native
  object checkResults extends TopLevel[checkResults with Double]
  
  /* 27 */ @js.native
  object clientOutOfMemory extends TopLevel[clientOutOfMemory with Double]
  
  /* 28 */ @js.native
  object clientTemporaryError extends TopLevel[clientTemporaryError with Double]
  
  /* 25 */ @js.native
  object connectError extends TopLevel[connectError with Double]
  
  /* 3 */ @js.native
  object deltaBadVal extends TopLevel[deltaBadVal with Double]
  
  /* 33 */ @js.native
  object duplicateItems extends TopLevel[duplicateItems with Double]
  
  /* 41 */ @js.native
  object durabilityFailed extends TopLevel[durabilityFailed with Double]
  
  /* 15 */ @js.native
  object failedToFindSymbol extends TopLevel[failedToFindSymbol with Double]
  
  /* 14 */ @js.native
  object failedToOpenLibrary extends TopLevel[failedToOpenLibrary with Double]
  
  /* 40 */ @js.native
  object genericError extends TopLevel[genericError with Double]
  
  /* 37 */ @js.native
  object invalidArguments extends TopLevel[invalidArguments with Double]
  
  /* 31 */ @js.native
  object invalidHostFormat extends TopLevel[invalidHostFormat with Double]
  
  /* 9 */ @js.native
  object invalidRange extends TopLevel[invalidRange with Double]
  
  /* 12 */ @js.native
  object keyAlreadyExists extends TopLevel[keyAlreadyExists with Double]
  
  /* 13 */ @js.native
  object keyNotFound extends TopLevel[keyNotFound with Double]
  
  /* 16 */ @js.native
  object networkError extends TopLevel[networkError with Double]
  
  /* 34 */ @js.native
  object noMatchingServerForKey extends TopLevel[noMatchingServerForKey with Double]
  
  /* 32 */ @js.native
  object notEnoughNodes extends TopLevel[notEnoughNodes with Double]
  
  /* 18 */ @js.native
  object notMyVBucket extends TopLevel[notMyVBucket with Double]
  
  /* 19 */ @js.native
  object notSorted extends TopLevel[notSorted with Double]
  
  /* 20 */ @js.native
  object notSupported extends TopLevel[notSupported with Double]
  
  /* 4 */ @js.native
  object objectTooBig extends TopLevel[objectTooBig with Double]
  
  /* 36 */ @js.native
  object outOfMemory extends TopLevel[outOfMemory with Double]
  
  /* 23 */ @js.native
  object protocolError extends TopLevel[protocolError with Double]
  
  /* 42 */ @js.native
  object restError extends TopLevel[restError with Double]
  
  /* 38 */ @js.native
  object schedulingError extends TopLevel[schedulingError with Double]
  
  /* 30 */ @js.native
  object serverBug extends TopLevel[serverBug with Double]
  
  /* 5 */ @js.native
  object serverBusy extends TopLevel[serverBusy with Double]
  
  /* 0 */ @js.native
  object success extends TopLevel[success with Double]
  
  /* 11 */ @js.native
  object temporaryError extends TopLevel[temporaryError with Double]
  
  /* 24 */ @js.native
  object timedOut extends TopLevel[timedOut with Double]
  
  /* 21 */ @js.native
  object unknownCommand extends TopLevel[unknownCommand with Double]
  
  /* 22 */ @js.native
  object unknownHost extends TopLevel[unknownHost with Double]
  
  /* 17 */ @js.native
  object wrongServer extends TopLevel[wrongServer with Double]
  
}


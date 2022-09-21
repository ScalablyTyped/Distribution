package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.std.WebGL2RenderingContext
import typings.std.WebGLRenderingContext
import typings.typescriptNn5FuAjk.anon.AcceptNode
import typings.typescriptNn5FuAjk.anon.LookupNamespaceURI
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.`public-key`
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.auto
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.password
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.require
import typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.vibration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AlgorithmIdentifier = Algorithm | java.lang.String

type AutoKeyword = auto

/**
  * Recursively unwraps the "awaited type" of a type. Non-promise "thenables" should resolve to `never`. This emulates the behavior of `await`.
  */
type Awaited[T] = (// the argument to `then` was not callable
T) | Any

type BigInteger = Uint8Array

type BlobCallback = js.Function1[/* blob */ Blob | Null, Unit]

/* Rewritten from type alias, can be one of: 
  - typings.typescriptNn5FuAjk.BufferSource
  - typings.typescriptNn5FuAjk.Blob
  - java.lang.String
*/
type BlobPart = _BlobPart | java.lang.String

type BodyInit = ReadableStream[Any] | XMLHttpRequestBodyInit

type COSEAlgorithmIdentifier = Double

type CSSNumberish = Double

/**
  * Convert first character of string literal type to uppercase
  */
type Capitalize[S /* <: java.lang.String */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify intrinsic */ Any

type ClassDecorator = js.Function1[/* target */ Function, Function | Unit]

type ClipboardItemData = Promise[java.lang.String | Blob]

type ClipboardItems = Array[ClipboardItem]

type ConstrainBoolean = scala.Boolean | ConstrainBooleanParameters

type ConstrainDOMString = java.lang.String | Array[java.lang.String] | ConstrainDOMStringParameters

type ConstrainDouble = Double | ConstrainDoubleRange

type ConstrainULong = Double | ConstrainULongRange

/**
  * Obtain the parameters of a constructor function type in a tuple
  */
type ConstructorParameters[T /* <: Instantiable1[/* args */ Any, Any] */] = Any

type DOMHighResTimeStamp = Double

/** Used by the dataset HTML attribute to represent data for custom attributes added to elements. */
type DOMStringMap = StringDictionary[js.UndefOr[java.lang.String]]

type DecodeErrorCallback = js.Function1[/* error */ DOMException, Unit]

type DecodeSuccessCallback = js.Function1[/* decodedData */ AudioBuffer, Unit]

type EpochTimeStamp = Double

type ErrorCallback = js.Function1[/* err */ DOMException, Unit]

type EventListener = js.Function1[/* evt */ Event, Unit]

type EventListenerOrEventListenerObject = EventListener | EventListenerObject

/**
  * Exclude from T those types that are assignable to U
  */
type Exclude[T, U] = T

type ExtendableEventInit = EventInit

/**
  * Extract from T those types that are assignable to U
  */
type Extract[T, U] = T

type FileCallback = js.Function1[/* file */ File, Unit]

type FileSystemEntriesCallback = js.Function1[/* entries */ Array[FileSystemEntry], Unit]

type FileSystemEntryCallback = js.Function1[/* entry */ FileSystemEntry, Unit]

type FlatArray[Arr, Depth /* <: Double */] = /* import warning: importer.ImportType#apply Failed type conversion: .typescript-nn5FuAjk.anon.Recur<Arr, Depth>[Depth extends -1 ? 'done' : 'recur'] */ js.Any

type Float32List = Float32Array | Array[GLfloat]

type FormDataEntryValue = File | java.lang.String

type FrameRequestCallback = js.Function1[/* time */ DOMHighResTimeStamp, Unit]

type FunctionStringCallback = js.Function1[/* data */ java.lang.String, Unit]

type GLbitfield = Double

type GLboolean = scala.Boolean

type GLclampf = Double

type GLenum = Double

type GLfloat = Double

type GLint = Double

type GLint64 = Double

type GLintptr = Double

type GLsizei = Double

type GLsizeiptr = Double

type GLuint = Double

type GLuint64 = Double

type GamepadHapticActuatorType = vibration

type HashAlgorithmIdentifier = AlgorithmIdentifier

type HeadersInit = Array[Array[java.lang.String]] | (Record[java.lang.String, java.lang.String]) | Headers

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - java.lang.String
  - typings.typescriptNn5FuAjk.Date
  - typings.typescriptNn5FuAjk.BufferSource
  - typings.typescriptNn5FuAjk.Array[scala.Any]
*/
type IDBValidKey = _IDBValidKey | Array[Any] | Double | java.lang.String

type IdleRequestCallback = js.Function1[/* deadline */ IdleDeadline, Unit]

/**
  * The type for the `assert` property of the optional second argument to `import()`.
  */
type ImportAssertions = StringDictionary[java.lang.String]

/**
  * Obtain the return type of a constructor function type
  */
type InstanceType[T /* <: Instantiable1[/* args */ Any, Any] */] = Any

type Int32List = Int32Array | Array[GLint]

type IntersectionObserverCallback = js.Function2[
/* entries */ Array[IntersectionObserverEntry], 
/* observer */ IntersectionObserver, 
Unit]

type LineAndPositionSetting = Double | AutoKeyword

type LockGrantedCallback = js.Function1[/* lock */ Lock | Null, Any]

/**
  * Convert string literal type to lowercase
  */
type Lowercase[S /* <: java.lang.String */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify intrinsic */ Any

type MediaSessionActionHandler = js.Function1[/* details */ MediaSessionActionDetails, Unit]

/* Rewritten from type alias, can be one of: 
  - typings.typescriptNn5FuAjk.WindowProxy
  - typings.typescriptNn5FuAjk.MessagePort
  - typings.typescriptNn5FuAjk.ServiceWorker
*/
type MessageEventSource = _MessageEventSource | WindowProxy

type MethodDecorator = js.Function3[
/* target */ Object, 
/* propertyKey */ java.lang.String | js.Symbol, 
/* descriptor */ TypedPropertyDescriptor[Any], 
TypedPropertyDescriptor[Any] | Unit]

type MutationCallback = js.Function2[/* mutations */ Array[MutationRecord], /* observer */ MutationObserver, Unit]

type NamedCurve = java.lang.String

type NodeFilter = (js.Function1[/* node */ Node, Double]) | AcceptNode

/**
  * Exclude null and undefined from T
  */
type NonNullable[T] = T

type NotificationPermissionCallback = js.Function1[/* permission */ NotificationPermission, Unit]

/** @deprecated this is not available in most browsers */
type OffscreenCanvas = EventTarget

/**
  * Construct a type with the properties of T except for those in type K.
  */
type Omit[T, K /* <: /* keyof any */ java.lang.String */] = Pick[T, Exclude[/* keyof T */ java.lang.String, K]]

/**
  * Removes the 'this' parameter from a function type.
  */
type OmitThisParameter[T] = T | (js.Function1[/* args */ Any, Any])

type OnBeforeUnloadEventHandler = OnBeforeUnloadEventHandlerNonNull | Null

type OnBeforeUnloadEventHandlerNonNull = js.Function1[/* event */ Event, java.lang.String | Null]

type OnErrorEventHandler = OnErrorEventHandlerNonNull | Null

type OnErrorEventHandlerNonNull = js.Function5[
/* event */ Event | java.lang.String, 
/* source */ js.UndefOr[java.lang.String], 
/* lineno */ js.UndefOr[Double], 
/* colno */ js.UndefOr[Double], 
/* error */ js.UndefOr[Error], 
Any]

type ParameterDecorator = js.Function3[
/* target */ Object, 
/* propertyKey */ java.lang.String | js.Symbol, 
/* parameterIndex */ Double, 
Unit]

/**
  * Obtain the parameters of a function type in a tuple
  */
type Parameters[T /* <: js.Function1[/* args */ Any, Any] */] = Any

/**
  * Make all properties in T optional
  */
type Partial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof T ]:? T[P]}
  */ typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.Partial & TopLevel[T]

type PerformanceEntryList = Array[PerformanceEntry]

type PerformanceObserverCallback = js.Function2[/* entries */ PerformanceObserverEntryList, /* observer */ PerformanceObserver, Unit]

/**
  * From T, pick a set of properties whose keys are in the union K
  */
type Pick[T, K /* <: /* keyof T */ java.lang.String */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in K ]: T[P]}
  */ typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.Pick & TopLevel[T]

type PositionCallback = js.Function1[/* position */ GeolocationPosition, Unit]

type PositionErrorCallback = js.Function1[/* positionError */ GeolocationPositionError, Unit]

type PromiseConstructorLike = Instantiable1[
/* executor */ js.Function2[
  /* resolve */ js.Function1[/* value */ js.Object | PromiseLike[js.Object], Unit], 
  /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
  Unit
], 
PromiseLike[js.Object]]

type PropertyDecorator = js.Function2[/* target */ Object, /* propertyKey */ java.lang.String | js.Symbol, Unit]

type PropertyDescriptorMap = StringDictionary[PropertyDescriptor]

type PropertyKey = java.lang.String | Double | js.Symbol

type PublicKeyCredentialType = `public-key`

type PushMessageDataInit = BufferSource | java.lang.String

type QueuingStrategySize[T] = js.Function1[/* chunk */ T, Double]

type RTCIceCredentialType = password

type RTCPeerConnectionErrorCallback = js.Function1[/* error */ DOMException, Unit]

type RTCRtcpMuxPolicy = require

type RTCSessionDescriptionCallback = js.Function1[/* description */ RTCSessionDescriptionInit, Unit]

type ReadableStreamController[T] = ReadableStreamDefaultController[T]

type ReadableStreamReader[T] = ReadableStreamDefaultReader[T]

/**
  * Make all properties in T readonly
  */
type Readonly[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{readonly [ P in keyof T ]: T[P]}
  */ typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.Readonly & TopLevel[T]

/**
  * Construct a type with a set of properties K of type T
  */
type Record[K /* <: /* keyof any */ java.lang.String */, T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in K ]: T}
  */ typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.Record & TopLevel[Any]

type RemotePlaybackAvailabilityCallback = js.Function1[/* available */ scala.Boolean, Unit]

/* Rewritten from type alias, can be one of: 
  - typings.typescriptNn5FuAjk.CanvasRenderingContext2D
  - typings.typescriptNn5FuAjk.ImageBitmapRenderingContext
  - typings.std.WebGLRenderingContext
  - typings.std.WebGL2RenderingContext
*/
type RenderingContext = _RenderingContext | WebGLRenderingContext | WebGL2RenderingContext

type RequestInfo = Request | java.lang.String

/**
  * Make all properties in T required
  */
type Required[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ P in keyof T ]: -? T[P]}
  */ typings.typescriptNn5FuAjk.typescriptNn5FuAjkStrings.Required & TopLevel[T]

type ResizeObserverCallback = js.Function2[/* entries */ Array[ResizeObserverEntry], /* observer */ ResizeObserver, Unit]

/**
  * Obtain the return type of a function type
  */
type ReturnType[T /* <: js.Function1[/* args */ Any, Any] */] = Any

type SVGMatrix = DOMMatrix

type SVGPoint = DOMPoint

type SVGRect = DOMRect

/**
  * Extracts the type of the 'this' parameter of a function type, or 'unknown' if the function type has no 'this' parameter.
  */
type ThisParameterType[T] = Any

type TimerHandler = java.lang.String | Function

type TransformerFlushCallback[O] = js.Function1[/* controller */ TransformStreamDefaultController[O], Unit | PromiseLike[Unit]]

type TransformerStartCallback[O] = js.Function1[/* controller */ TransformStreamDefaultController[O], Any]

type TransformerTransformCallback[I, O] = js.Function2[
/* chunk */ I, 
/* controller */ TransformStreamDefaultController[O], 
Unit | PromiseLike[Unit]]

type Uint32List = Uint32Array | Array[GLuint]

/**
  * Convert first character of string literal type to lowercase
  */
type Uncapitalize[S /* <: java.lang.String */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify intrinsic */ Any

type UnderlyingSinkAbortCallback = js.Function1[/* reason */ js.UndefOr[Any], Unit | PromiseLike[Unit]]

type UnderlyingSinkCloseCallback = js.Function0[Unit | PromiseLike[Unit]]

type UnderlyingSinkStartCallback = js.Function1[/* controller */ WritableStreamDefaultController, Any]

type UnderlyingSinkWriteCallback[W] = js.Function2[
/* chunk */ W, 
/* controller */ WritableStreamDefaultController, 
Unit | PromiseLike[Unit]]

type UnderlyingSourceCancelCallback = js.Function1[/* reason */ js.UndefOr[Any], Unit | PromiseLike[Unit]]

type UnderlyingSourcePullCallback[R] = js.Function1[/* controller */ ReadableStreamController[R], Unit | PromiseLike[Unit]]

type UnderlyingSourceStartCallback[R] = js.Function1[/* controller */ ReadableStreamController[R], Any]

/**
  * Convert string literal type to uppercase
  */
type Uppercase[S /* <: java.lang.String */] = /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify intrinsic */ Any

type UvmEntries = Array[UvmEntry]

type UvmEntry = Array[Double]

type VibratePattern = Double | Array[Double]

type VideoFrameRequestCallback = js.Function2[/* now */ DOMHighResTimeStamp, /* metadata */ VideoFrameMetadata, Unit]

type VoidFunction = js.Function0[Unit]

type WebKitCSSMatrix = DOMMatrix

type WindowProxy = Window

/* Rewritten from type alias, can be one of: 
  - typings.typescriptNn5FuAjk.Blob
  - typings.typescriptNn5FuAjk.BufferSource
  - typings.typescriptNn5FuAjk.FormData
  - typings.typescriptNn5FuAjk.URLSearchParams
  - java.lang.String
*/
type XMLHttpRequestBodyInit = _XMLHttpRequestBodyInit | java.lang.String

type XPathNSResolver = (js.Function1[/* prefix */ java.lang.String | Null, java.lang.String | Null]) | LookupNamespaceURI

type webkitURL = URL

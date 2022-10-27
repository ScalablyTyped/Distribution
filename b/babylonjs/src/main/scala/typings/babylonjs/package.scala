package typings.babylonjs

import typings.babylonjs.babylonjsStrings.`write-only`
import typings.babylonjs.babylonjsStrings.auto
import typings.babylonjs.babylonjsStrings.cpu
import typings.babylonjs.babylonjsStrings.destroyed
import typings.babylonjs.babylonjsStrings.redraw
import typings.babylonjs.babylonjsStrings.srgb
import typings.std.DOMHighResTimeStamp
import typings.std.Event
import typings.std.EventTarget
import typings.std.ReadonlySet
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type GPUAutoLayoutMode = auto

type GPUBufferDynamicOffset = Double

type GPUBufferUsageFlags = Double

type GPUColor = (js.Tuple4[Double, Double, Double, Double]) | GPUColorDict

type GPUColorWriteFlags = Double

type GPUCommandBufferDescriptor = GPUObjectDescriptorBase

type GPUCommandEncoderDescriptor = GPUObjectDescriptorBase

type GPUComputePassTimestampWrites = js.Array[GPUComputePassTimestampWrite]

/* unsigned long */
type GPUDepthBias = Double

type GPUDeviceLostReason = destroyed

type GPUExtent3D = (js.Tuple3[GPUIntegerCoordinate, GPUIntegerCoordinate, GPUIntegerCoordinate]) | GPUExtent3DDict

/* unsigned long */
type GPUIndex32 = Double

/* unsigned long long */
type GPUIntegerCoordinate = Double

type GPUMapModeFlags = Double

type GPUOrigin2D = (js.Tuple2[GPUIntegerCoordinate, GPUIntegerCoordinate]) | GPUOrigin2DDict

type GPUOrigin3D = (js.Tuple3[GPUIntegerCoordinate, GPUIntegerCoordinate, GPUIntegerCoordinate]) | GPUOrigin3DDict

type GPUPipelineConstantValue = Double

type GPUPredefinedColorSpace = srgb

type GPUQueueDescriptor = GPUObjectDescriptorBase

type GPURenderBundleDescriptor = GPUObjectDescriptorBase

type GPURenderPassTimestampWrites = js.Array[GPURenderPassTimestampWrite]

/* unsigned long */
type GPUSampleMask = Double

type GPUShaderStageFlags = Double

/* unsigned long */
type GPUSignedOffset32 = Double

/* unsigned long */
type GPUSize32 = Double

/* long */
type GPUSize64 = Double

/* unsigned long */
type GPUStencilValue = Double

type GPUStorageTextureAccess = `write-only`

type GPUSupportedFeatures = ReadonlySet[String]

type GPUTextureUsageFlags = Double

// Experimental Pressure API https://wicg.github.io/compute-pressure/
type PressureSource = cpu

type PressureUpdateCallback = js.Function2[/* changes */ js.Array[PressureRecord], /* observer */ PressureObserver, Unit]

// Experimental/Draft features
// Anchors
type XRAnchorSet = Set[XRAnchor]

type XREventHandler = js.Function1[/* evt */ Event, Any]

type XRFrameRequestCallback = js.Function2[/* time */ DOMHighResTimeStamp, /* frame */ XRFrame, Unit]

type XRInputSourceChangeEventHandler = js.Function1[/* evt */ XRInputSourceChangeEvent, Any]

type XRInputSourceEventHandler = js.Function1[/* evt */ XRInputSourceEvent, Any]

// WebXR Layers
/**
  * The base class for XRWebGLLayer and other layer types introduced by future extensions.
  * ref: https://immersive-web.github.io/webxr/#xrlayer-interface
  */
// tslint:disable-next-line no-empty-interface
type XRLayer = EventTarget

type XRLayerEventType = redraw

type XRMeshSet = Set[XRMesh]

// Plane detection
type XRPlaneSet = Set[XRPlane]

type XRReferenceSpaceEventHandler = js.Function1[/* event */ XRReferenceSpaceEvent, Any]

type XRSessionEventHandler = js.Function1[/* evt */ XRSessionEvent, Any]

/**
  * Represents a virtual coordinate system with an origin that corresponds to a physical location.
  * Spatial data that is requested from the API or given to the API is always expressed in relation
  * to a specific XRSpace at the time of a specific XRFrame. Numeric values such as pose positions
  * are coordinates in that space relative to its origin. The interface is intentionally opaque.
  *
  * ref: https://immersive-web.github.io/webxr/#xrspace-interface
  */
// tslint:disable-next-line no-empty-interface
type XRSpace = EventTarget

type XRSystemDeviceChangeEventHandler = js.Function1[/* event */ XRSystemDeviceChangeEvent, Any]

type XRSystemSessionGrantedEventHandler = js.Function1[/* event */ XRSystemSessionGrantedEvent, Any]

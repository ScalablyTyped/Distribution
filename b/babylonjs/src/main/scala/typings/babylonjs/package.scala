package typings.babylonjs

import typings.babylonjs.babylonjsStrings.`bounded-floor`
import typings.babylonjs.babylonjsStrings.`write-only`
import typings.babylonjs.babylonjsStrings.auto
import typings.babylonjs.babylonjsStrings.destroyed
import typings.babylonjs.babylonjsStrings.srgb
import typings.std.DOMHighResTimeStamp
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

type XRAnchorSet = Set[XRAnchor]

type XRBoundedReferenceSpaceType = `bounded-floor`

type XREventHandler = js.Function1[/* callback */ Any, Unit]

type XRFrameRequestCallback = js.Function2[/* time */ DOMHighResTimeStamp, /* frame */ XRFrame, Unit]

// to be extended
type XRHandJoint = String

type XRInputSourceArray = js.Array[XRInputSource]

type XRJointSpace = XRSpace

type XRLayer = EventTarget

type XRMeshSet = Set[XRMesh]

type XRPlaneSet = Set[XRPlane]

// tslint:disable-next-line no-empty-interface
type XRSpace = EventTarget

package typings.babylonjs.anon

import typings.babylonjs.BABYLON.DeepImmutable
import typings.babylonjs.BABYLON.Matrix
import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.BABYLON.Quaternion
import typings.babylonjs.BABYLON.TransformNode
import typings.babylonjs.BABYLON.Vector3
import typings.babylonjs.BABYLON.Vector4
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined babylonjs.BABYLON.DeepImmutableObject<babylonjs.BABYLON.Matrix> */
trait DeepImmutableObjectMatrixAdd extends StObject {
  
  val _isIdentity: DeepImmutable[Any]
  
  val _isIdentity3x2: DeepImmutable[Any]
  
  val _isIdentity3x2Dirty: DeepImmutable[Any]
  
  val _isIdentityDirty: DeepImmutable[Any]
  
  val _m: DeepImmutable[Any]
  
  val _updateIdentityStatus: DeepImmutable[Any]
  
  val add: DeepImmutable[js.Function1[/* other */ DeepImmutable[Matrix], this.type]]
  
  val addAtIndex: DeepImmutable[js.Function2[/* index */ Double, /* value */ Double, this.type]]
  
  val addToRef: DeepImmutable[js.Function2[/* other */ DeepImmutable[Matrix], /* result */ Matrix, Matrix]]
  
  val addToSelf: DeepImmutable[js.Function1[/* other */ DeepImmutable[Matrix], this.type]]
  
  val addTranslationFromFloats: DeepImmutable[js.Function3[/* x */ Double, /* y */ Double, /* z */ Double, this.type]]
  
  val asArray: DeepImmutable[js.Function0[DeepImmutable[js.typedarray.Float32Array | js.Array[Double]]]]
  
  @JSName("clone")
  val clone_FDeepImmutableObjectMatrixAdd: DeepImmutable[js.Function0[this.type]]
  
  val copyFrom: DeepImmutable[js.Function1[/* other */ DeepImmutable[Matrix], this.type]]
  
  val copyToArray: DeepImmutable[
    js.Function2[
      /* array */ js.typedarray.Float32Array | js.Array[Double], 
      /* offset */ js.UndefOr[Double], 
      this.type
    ]
  ]
  
  val decompose: DeepImmutable[
    js.Function4[
      /* scale */ js.UndefOr[Vector3], 
      /* rotation */ js.UndefOr[Quaternion], 
      /* translation */ js.UndefOr[Vector3], 
      /* preserveScalingNode */ js.UndefOr[TransformNode], 
      Boolean
    ]
  ]
  
  val decomposeToTransformNode: DeepImmutable[js.Function1[/* node */ TransformNode, Boolean]]
  
  val determinant: DeepImmutable[js.Function0[Double]]
  
  @JSName("equals")
  val equals_FDeepImmutableObjectMatrixAdd: DeepImmutable[js.Function1[/* value */ DeepImmutable[Matrix], Boolean]]
  
  val getClassName: DeepImmutable[js.Function0[String]]
  
  val getHashCode: DeepImmutable[js.Function0[Double]]
  
  val getRotationMatrix: DeepImmutable[js.Function0[this.type]]
  
  val getRotationMatrixToRef: DeepImmutable[js.Function1[/* result */ Matrix, Matrix]]
  
  val getRow: DeepImmutable[js.Function1[/* index */ Double, Nullable[Vector4]]]
  
  val getRowToRef: DeepImmutable[js.Function2[/* index */ Double, /* rowVector */ Vector4, Vector4]]
  
  val getTranslation: DeepImmutable[js.Function0[Vector3]]
  
  val getTranslationToRef: DeepImmutable[js.Function1[/* result */ Vector3, Vector3]]
  
  val invert: DeepImmutable[js.Function0[this.type]]
  
  val invertToRef: DeepImmutable[js.Function1[/* other */ Matrix, Matrix]]
  
  val isIdentity: DeepImmutable[js.Function0[Boolean]]
  
  val isIdentityAs3x2: DeepImmutable[js.Function0[Boolean]]
  
  val m: DeepImmutable[js.Function0[DeepImmutable[js.typedarray.Float32Array | js.Array[Double]]]]
  
  val markAsUpdated: DeepImmutable[js.Function0[Unit]]
  
  val multiply: DeepImmutable[js.Function1[/* other */ DeepImmutable[Matrix], this.type]]
  
  val multiplyAtIndex: DeepImmutable[js.Function2[/* index */ Double, /* value */ Double, this.type]]
  
  val multiplyToArray: DeepImmutable[
    js.Function3[
      /* other */ DeepImmutable[Matrix], 
      /* result */ js.typedarray.Float32Array | js.Array[Double], 
      /* offset */ Double, 
      this.type
    ]
  ]
  
  val multiplyToRef: DeepImmutable[js.Function2[/* other */ DeepImmutable[Matrix], /* result */ Matrix, Matrix]]
  
  val removeRotationAndScaling: DeepImmutable[js.Function0[this.type]]
  
  val reset: DeepImmutable[js.Function0[this.type]]
  
  val scale: DeepImmutable[js.Function1[/* scale */ Double, this.type]]
  
  val scaleAndAddToRef: DeepImmutable[js.Function2[/* scale */ Double, /* result */ Matrix, Matrix]]
  
  val scaleToRef: DeepImmutable[js.Function2[/* scale */ Double, /* result */ Matrix, Matrix]]
  
  val setRow: DeepImmutable[js.Function2[/* index */ Double, /* row */ Vector4, this.type]]
  
  val setRowFromFloats: DeepImmutable[
    js.Function5[
      /* index */ Double, 
      /* x */ Double, 
      /* y */ Double, 
      /* z */ Double, 
      /* w */ Double, 
      this.type
    ]
  ]
  
  val setTranslation: DeepImmutable[js.Function1[/* vector3 */ DeepImmutable[Vector3], this.type]]
  
  val setTranslationFromFloats: DeepImmutable[js.Function3[/* x */ Double, /* y */ Double, /* z */ Double, this.type]]
  
  val toArray: DeepImmutable[js.Function0[DeepImmutable[js.typedarray.Float32Array | js.Array[Double]]]]
  
  val toNormalMatrix: DeepImmutable[js.Function1[/* ref */ Matrix, Matrix]]
  
  val toggleModelMatrixHandInPlace: DeepImmutable[js.Function0[this.type]]
  
  val toggleProjectionMatrixHandInPlace: DeepImmutable[js.Function0[this.type]]
  
  val transpose: DeepImmutable[js.Function0[this.type]]
  
  val transposeToRef: DeepImmutable[js.Function1[/* result */ Matrix, Matrix]]
  
  val updateFlag: DeepImmutable[Double]
}
object DeepImmutableObjectMatrixAdd {
  
  inline def apply(
    _isIdentity: DeepImmutable[Any],
    _isIdentity3x2: DeepImmutable[Any],
    _isIdentity3x2Dirty: DeepImmutable[Any],
    _isIdentityDirty: DeepImmutable[Any],
    _m: DeepImmutable[Any],
    _updateIdentityStatus: DeepImmutable[Any],
    add: /* other */ DeepImmutable[Matrix] => DeepImmutableObjectMatrixAdd,
    addAtIndex: (/* index */ Double, /* value */ Double) => DeepImmutableObjectMatrixAdd,
    addToRef: (/* other */ DeepImmutable[Matrix], /* result */ Matrix) => Matrix,
    addToSelf: /* other */ DeepImmutable[Matrix] => DeepImmutableObjectMatrixAdd,
    addTranslationFromFloats: (/* x */ Double, /* y */ Double, /* z */ Double) => DeepImmutableObjectMatrixAdd,
    asArray: () => DeepImmutable[js.typedarray.Float32Array | js.Array[Double]],
    clone_ : () => DeepImmutableObjectMatrixAdd,
    copyFrom: /* other */ DeepImmutable[Matrix] => DeepImmutableObjectMatrixAdd,
    copyToArray: (/* array */ js.typedarray.Float32Array | js.Array[Double], /* offset */ js.UndefOr[Double]) => DeepImmutableObjectMatrixAdd,
    decompose: (/* scale */ js.UndefOr[Vector3], /* rotation */ js.UndefOr[Quaternion], /* translation */ js.UndefOr[Vector3], /* preserveScalingNode */ js.UndefOr[TransformNode]) => Boolean,
    decomposeToTransformNode: /* node */ TransformNode => Boolean,
    determinant: () => Double,
    equals_ : /* value */ DeepImmutable[Matrix] => Boolean,
    getClassName: () => String,
    getHashCode: () => Double,
    getRotationMatrix: () => DeepImmutableObjectMatrixAdd,
    getRotationMatrixToRef: /* result */ Matrix => Matrix,
    getRow: /* index */ Double => Nullable[Vector4],
    getRowToRef: (/* index */ Double, /* rowVector */ Vector4) => Vector4,
    getTranslation: () => Vector3,
    getTranslationToRef: /* result */ Vector3 => Vector3,
    invert: () => DeepImmutableObjectMatrixAdd,
    invertToRef: /* other */ Matrix => Matrix,
    isIdentity: () => Boolean,
    isIdentityAs3x2: () => Boolean,
    m: () => DeepImmutable[js.typedarray.Float32Array | js.Array[Double]],
    markAsUpdated: () => Unit,
    multiply: /* other */ DeepImmutable[Matrix] => DeepImmutableObjectMatrixAdd,
    multiplyAtIndex: (/* index */ Double, /* value */ Double) => DeepImmutableObjectMatrixAdd,
    multiplyToArray: (/* other */ DeepImmutable[Matrix], /* result */ js.typedarray.Float32Array | js.Array[Double], /* offset */ Double) => DeepImmutableObjectMatrixAdd,
    multiplyToRef: (/* other */ DeepImmutable[Matrix], /* result */ Matrix) => Matrix,
    removeRotationAndScaling: () => DeepImmutableObjectMatrixAdd,
    reset: () => DeepImmutableObjectMatrixAdd,
    scale: /* scale */ Double => DeepImmutableObjectMatrixAdd,
    scaleAndAddToRef: (/* scale */ Double, /* result */ Matrix) => Matrix,
    scaleToRef: (/* scale */ Double, /* result */ Matrix) => Matrix,
    setRow: (/* index */ Double, /* row */ Vector4) => DeepImmutableObjectMatrixAdd,
    setRowFromFloats: (/* index */ Double, /* x */ Double, /* y */ Double, /* z */ Double, /* w */ Double) => DeepImmutableObjectMatrixAdd,
    setTranslation: /* vector3 */ DeepImmutable[Vector3] => DeepImmutableObjectMatrixAdd,
    setTranslationFromFloats: (/* x */ Double, /* y */ Double, /* z */ Double) => DeepImmutableObjectMatrixAdd,
    toArray: () => DeepImmutable[js.typedarray.Float32Array | js.Array[Double]],
    toNormalMatrix: /* ref */ Matrix => Matrix,
    toggleModelMatrixHandInPlace: () => DeepImmutableObjectMatrixAdd,
    toggleProjectionMatrixHandInPlace: () => DeepImmutableObjectMatrixAdd,
    transpose: () => DeepImmutableObjectMatrixAdd,
    transposeToRef: /* result */ Matrix => Matrix,
    updateFlag: DeepImmutable[Double]
  ): DeepImmutableObjectMatrixAdd = {
    val __obj = js.Dynamic.literal(_isIdentity = _isIdentity.asInstanceOf[js.Any], _isIdentity3x2 = _isIdentity3x2.asInstanceOf[js.Any], _isIdentity3x2Dirty = _isIdentity3x2Dirty.asInstanceOf[js.Any], _isIdentityDirty = _isIdentityDirty.asInstanceOf[js.Any], _m = _m.asInstanceOf[js.Any], _updateIdentityStatus = _updateIdentityStatus.asInstanceOf[js.Any], add = js.Any.fromFunction1(add), addAtIndex = js.Any.fromFunction2(addAtIndex), addToRef = js.Any.fromFunction2(addToRef), addToSelf = js.Any.fromFunction1(addToSelf), addTranslationFromFloats = js.Any.fromFunction3(addTranslationFromFloats), asArray = js.Any.fromFunction0(asArray), copyFrom = js.Any.fromFunction1(copyFrom), copyToArray = js.Any.fromFunction2(copyToArray), decompose = js.Any.fromFunction4(decompose), decomposeToTransformNode = js.Any.fromFunction1(decomposeToTransformNode), determinant = js.Any.fromFunction0(determinant), getClassName = js.Any.fromFunction0(getClassName), getHashCode = js.Any.fromFunction0(getHashCode), getRotationMatrix = js.Any.fromFunction0(getRotationMatrix), getRotationMatrixToRef = js.Any.fromFunction1(getRotationMatrixToRef), getRow = js.Any.fromFunction1(getRow), getRowToRef = js.Any.fromFunction2(getRowToRef), getTranslation = js.Any.fromFunction0(getTranslation), getTranslationToRef = js.Any.fromFunction1(getTranslationToRef), invert = js.Any.fromFunction0(invert), invertToRef = js.Any.fromFunction1(invertToRef), isIdentity = js.Any.fromFunction0(isIdentity), isIdentityAs3x2 = js.Any.fromFunction0(isIdentityAs3x2), m = js.Any.fromFunction0(m), markAsUpdated = js.Any.fromFunction0(markAsUpdated), multiply = js.Any.fromFunction1(multiply), multiplyAtIndex = js.Any.fromFunction2(multiplyAtIndex), multiplyToArray = js.Any.fromFunction3(multiplyToArray), multiplyToRef = js.Any.fromFunction2(multiplyToRef), removeRotationAndScaling = js.Any.fromFunction0(removeRotationAndScaling), reset = js.Any.fromFunction0(reset), scale = js.Any.fromFunction1(scale), scaleAndAddToRef = js.Any.fromFunction2(scaleAndAddToRef), scaleToRef = js.Any.fromFunction2(scaleToRef), setRow = js.Any.fromFunction2(setRow), setRowFromFloats = js.Any.fromFunction5(setRowFromFloats), setTranslation = js.Any.fromFunction1(setTranslation), setTranslationFromFloats = js.Any.fromFunction3(setTranslationFromFloats), toArray = js.Any.fromFunction0(toArray), toNormalMatrix = js.Any.fromFunction1(toNormalMatrix), toggleModelMatrixHandInPlace = js.Any.fromFunction0(toggleModelMatrixHandInPlace), toggleProjectionMatrixHandInPlace = js.Any.fromFunction0(toggleProjectionMatrixHandInPlace), transpose = js.Any.fromFunction0(transpose), transposeToRef = js.Any.fromFunction1(transposeToRef), updateFlag = updateFlag.asInstanceOf[js.Any])
    __obj.updateDynamic("clone")(js.Any.fromFunction0(clone_))
    __obj.updateDynamic("equals")(js.Any.fromFunction1(equals_))
    __obj.asInstanceOf[DeepImmutableObjectMatrixAdd]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeepImmutableObjectMatrixAdd] (val x: Self) extends AnyVal {
    
    inline def setAdd(value: /* other */ DeepImmutable[Matrix] => DeepImmutableObjectMatrixAdd): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setAddAtIndex(value: (/* index */ Double, /* value */ Double) => DeepImmutableObjectMatrixAdd): Self = StObject.set(x, "addAtIndex", js.Any.fromFunction2(value))
    
    inline def setAddToRef(value: (/* other */ DeepImmutable[Matrix], /* result */ Matrix) => Matrix): Self = StObject.set(x, "addToRef", js.Any.fromFunction2(value))
    
    inline def setAddToSelf(value: /* other */ DeepImmutable[Matrix] => DeepImmutableObjectMatrixAdd): Self = StObject.set(x, "addToSelf", js.Any.fromFunction1(value))
    
    inline def setAddTranslationFromFloats(value: (/* x */ Double, /* y */ Double, /* z */ Double) => DeepImmutableObjectMatrixAdd): Self = StObject.set(x, "addTranslationFromFloats", js.Any.fromFunction3(value))
    
    inline def setAsArray(value: () => DeepImmutable[js.typedarray.Float32Array | js.Array[Double]]): Self = StObject.set(x, "asArray", js.Any.fromFunction0(value))
    
    inline def setClone_(value: () => DeepImmutableObjectMatrixAdd): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    inline def setCopyFrom(value: /* other */ DeepImmutable[Matrix] => DeepImmutableObjectMatrixAdd): Self = StObject.set(x, "copyFrom", js.Any.fromFunction1(value))
    
    inline def setCopyToArray(
      value: (/* array */ js.typedarray.Float32Array | js.Array[Double], /* offset */ js.UndefOr[Double]) => DeepImmutableObjectMatrixAdd
    ): Self = StObject.set(x, "copyToArray", js.Any.fromFunction2(value))
    
    inline def setDecompose(
      value: (/* scale */ js.UndefOr[Vector3], /* rotation */ js.UndefOr[Quaternion], /* translation */ js.UndefOr[Vector3], /* preserveScalingNode */ js.UndefOr[TransformNode]) => Boolean
    ): Self = StObject.set(x, "decompose", js.Any.fromFunction4(value))
    
    inline def setDecomposeToTransformNode(value: /* node */ TransformNode => Boolean): Self = StObject.set(x, "decomposeToTransformNode", js.Any.fromFunction1(value))
    
    inline def setDeterminant(value: () => Double): Self = StObject.set(x, "determinant", js.Any.fromFunction0(value))
    
    inline def setEquals_(value: /* value */ DeepImmutable[Matrix] => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setGetClassName(value: () => String): Self = StObject.set(x, "getClassName", js.Any.fromFunction0(value))
    
    inline def setGetHashCode(value: () => Double): Self = StObject.set(x, "getHashCode", js.Any.fromFunction0(value))
    
    inline def setGetRotationMatrix(value: () => DeepImmutableObjectMatrixAdd): Self = StObject.set(x, "getRotationMatrix", js.Any.fromFunction0(value))
    
    inline def setGetRotationMatrixToRef(value: /* result */ Matrix => Matrix): Self = StObject.set(x, "getRotationMatrixToRef", js.Any.fromFunction1(value))
    
    inline def setGetRow(value: /* index */ Double => Nullable[Vector4]): Self = StObject.set(x, "getRow", js.Any.fromFunction1(value))
    
    inline def setGetRowToRef(value: (/* index */ Double, /* rowVector */ Vector4) => Vector4): Self = StObject.set(x, "getRowToRef", js.Any.fromFunction2(value))
    
    inline def setGetTranslation(value: () => Vector3): Self = StObject.set(x, "getTranslation", js.Any.fromFunction0(value))
    
    inline def setGetTranslationToRef(value: /* result */ Vector3 => Vector3): Self = StObject.set(x, "getTranslationToRef", js.Any.fromFunction1(value))
    
    inline def setInvert(value: () => DeepImmutableObjectMatrixAdd): Self = StObject.set(x, "invert", js.Any.fromFunction0(value))
    
    inline def setInvertToRef(value: /* other */ Matrix => Matrix): Self = StObject.set(x, "invertToRef", js.Any.fromFunction1(value))
    
    inline def setIsIdentity(value: () => Boolean): Self = StObject.set(x, "isIdentity", js.Any.fromFunction0(value))
    
    inline def setIsIdentityAs3x2(value: () => Boolean): Self = StObject.set(x, "isIdentityAs3x2", js.Any.fromFunction0(value))
    
    inline def setM(value: () => DeepImmutable[js.typedarray.Float32Array | js.Array[Double]]): Self = StObject.set(x, "m", js.Any.fromFunction0(value))
    
    inline def setMarkAsUpdated(value: () => Unit): Self = StObject.set(x, "markAsUpdated", js.Any.fromFunction0(value))
    
    inline def setMultiply(value: /* other */ DeepImmutable[Matrix] => DeepImmutableObjectMatrixAdd): Self = StObject.set(x, "multiply", js.Any.fromFunction1(value))
    
    inline def setMultiplyAtIndex(value: (/* index */ Double, /* value */ Double) => DeepImmutableObjectMatrixAdd): Self = StObject.set(x, "multiplyAtIndex", js.Any.fromFunction2(value))
    
    inline def setMultiplyToArray(
      value: (/* other */ DeepImmutable[Matrix], /* result */ js.typedarray.Float32Array | js.Array[Double], /* offset */ Double) => DeepImmutableObjectMatrixAdd
    ): Self = StObject.set(x, "multiplyToArray", js.Any.fromFunction3(value))
    
    inline def setMultiplyToRef(value: (/* other */ DeepImmutable[Matrix], /* result */ Matrix) => Matrix): Self = StObject.set(x, "multiplyToRef", js.Any.fromFunction2(value))
    
    inline def setRemoveRotationAndScaling(value: () => DeepImmutableObjectMatrixAdd): Self = StObject.set(x, "removeRotationAndScaling", js.Any.fromFunction0(value))
    
    inline def setReset(value: () => DeepImmutableObjectMatrixAdd): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setScale(value: /* scale */ Double => DeepImmutableObjectMatrixAdd): Self = StObject.set(x, "scale", js.Any.fromFunction1(value))
    
    inline def setScaleAndAddToRef(value: (/* scale */ Double, /* result */ Matrix) => Matrix): Self = StObject.set(x, "scaleAndAddToRef", js.Any.fromFunction2(value))
    
    inline def setScaleToRef(value: (/* scale */ Double, /* result */ Matrix) => Matrix): Self = StObject.set(x, "scaleToRef", js.Any.fromFunction2(value))
    
    inline def setSetRow(value: (/* index */ Double, /* row */ Vector4) => DeepImmutableObjectMatrixAdd): Self = StObject.set(x, "setRow", js.Any.fromFunction2(value))
    
    inline def setSetRowFromFloats(
      value: (/* index */ Double, /* x */ Double, /* y */ Double, /* z */ Double, /* w */ Double) => DeepImmutableObjectMatrixAdd
    ): Self = StObject.set(x, "setRowFromFloats", js.Any.fromFunction5(value))
    
    inline def setSetTranslation(value: /* vector3 */ DeepImmutable[Vector3] => DeepImmutableObjectMatrixAdd): Self = StObject.set(x, "setTranslation", js.Any.fromFunction1(value))
    
    inline def setSetTranslationFromFloats(value: (/* x */ Double, /* y */ Double, /* z */ Double) => DeepImmutableObjectMatrixAdd): Self = StObject.set(x, "setTranslationFromFloats", js.Any.fromFunction3(value))
    
    inline def setToArray(value: () => DeepImmutable[js.typedarray.Float32Array | js.Array[Double]]): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
    
    inline def setToNormalMatrix(value: /* ref */ Matrix => Matrix): Self = StObject.set(x, "toNormalMatrix", js.Any.fromFunction1(value))
    
    inline def setToggleModelMatrixHandInPlace(value: () => DeepImmutableObjectMatrixAdd): Self = StObject.set(x, "toggleModelMatrixHandInPlace", js.Any.fromFunction0(value))
    
    inline def setToggleProjectionMatrixHandInPlace(value: () => DeepImmutableObjectMatrixAdd): Self = StObject.set(x, "toggleProjectionMatrixHandInPlace", js.Any.fromFunction0(value))
    
    inline def setTranspose(value: () => DeepImmutableObjectMatrixAdd): Self = StObject.set(x, "transpose", js.Any.fromFunction0(value))
    
    inline def setTransposeToRef(value: /* result */ Matrix => Matrix): Self = StObject.set(x, "transposeToRef", js.Any.fromFunction1(value))
    
    inline def setUpdateFlag(value: DeepImmutable[Double]): Self = StObject.set(x, "updateFlag", value.asInstanceOf[js.Any])
    
    inline def set_isIdentity(value: DeepImmutable[Any]): Self = StObject.set(x, "_isIdentity", value.asInstanceOf[js.Any])
    
    inline def set_isIdentity3x2(value: DeepImmutable[Any]): Self = StObject.set(x, "_isIdentity3x2", value.asInstanceOf[js.Any])
    
    inline def set_isIdentity3x2Dirty(value: DeepImmutable[Any]): Self = StObject.set(x, "_isIdentity3x2Dirty", value.asInstanceOf[js.Any])
    
    inline def set_isIdentityDirty(value: DeepImmutable[Any]): Self = StObject.set(x, "_isIdentityDirty", value.asInstanceOf[js.Any])
    
    inline def set_m(value: DeepImmutable[Any]): Self = StObject.set(x, "_m", value.asInstanceOf[js.Any])
    
    inline def set_updateIdentityStatus(value: DeepImmutable[Any]): Self = StObject.set(x, "_updateIdentityStatus", value.asInstanceOf[js.Any])
  }
}

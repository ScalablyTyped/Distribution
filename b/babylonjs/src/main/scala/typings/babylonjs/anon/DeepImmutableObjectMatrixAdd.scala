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
  
  val add: DeepImmutable[js.Function1[/* other */ DeepImmutable[Matrix], Matrix]]
  
  val addAtIndex: DeepImmutable[js.Function2[/* index */ Double, /* value */ Double, Matrix]]
  
  val addToRef: DeepImmutable[js.Function2[/* other */ DeepImmutable[Matrix], /* result */ Matrix, Matrix]]
  
  val addToSelf: DeepImmutable[js.Function1[/* other */ DeepImmutable[Matrix], Matrix]]
  
  val addTranslationFromFloats: DeepImmutable[js.Function3[/* x */ Double, /* y */ Double, /* z */ Double, Matrix]]
  
  val asArray: DeepImmutable[js.Function0[DeepImmutable[js.typedarray.Float32Array | js.Array[Double]]]]
  
  @JSName("clone")
  val clone_FDeepImmutableObjectMatrixAdd: DeepImmutable[js.Function0[Matrix]]
  
  val copyFrom: DeepImmutable[js.Function1[/* other */ DeepImmutable[Matrix], Matrix]]
  
  val copyToArray: DeepImmutable[
    js.Function2[
      /* array */ js.typedarray.Float32Array | js.Array[Double], 
      /* offset */ js.UndefOr[Double], 
      Matrix
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
  
  val getRotationMatrix: DeepImmutable[js.Function0[Matrix]]
  
  val getRotationMatrixToRef: DeepImmutable[js.Function1[/* result */ Matrix, Matrix]]
  
  val getRow: DeepImmutable[js.Function1[/* index */ Double, Nullable[Vector4]]]
  
  val getRowToRef: DeepImmutable[js.Function2[/* index */ Double, /* rowVector */ Vector4, Matrix]]
  
  val getTranslation: DeepImmutable[js.Function0[Vector3]]
  
  val getTranslationToRef: DeepImmutable[js.Function1[/* result */ Vector3, Matrix]]
  
  val invert: DeepImmutable[js.Function0[Matrix]]
  
  val invertToRef: DeepImmutable[js.Function1[/* other */ Matrix, Matrix]]
  
  val isIdentity: DeepImmutable[js.Function0[Boolean]]
  
  val isIdentityAs3x2: DeepImmutable[js.Function0[Boolean]]
  
  val m: DeepImmutable[js.Function0[DeepImmutable[js.typedarray.Float32Array | js.Array[Double]]]]
  
  val markAsUpdated: DeepImmutable[js.Function0[Unit]]
  
  val multiply: DeepImmutable[js.Function1[/* other */ DeepImmutable[Matrix], Matrix]]
  
  val multiplyAtIndex: DeepImmutable[js.Function2[/* index */ Double, /* value */ Double, Matrix]]
  
  val multiplyToArray: DeepImmutable[
    js.Function3[
      /* other */ DeepImmutable[Matrix], 
      /* result */ js.typedarray.Float32Array | js.Array[Double], 
      /* offset */ Double, 
      Matrix
    ]
  ]
  
  val multiplyToRef: DeepImmutable[js.Function2[/* other */ DeepImmutable[Matrix], /* result */ Matrix, Matrix]]
  
  val removeRotationAndScaling: DeepImmutable[js.Function0[Matrix]]
  
  val reset: DeepImmutable[js.Function0[Matrix]]
  
  val scale: DeepImmutable[js.Function1[/* scale */ Double, Matrix]]
  
  val scaleAndAddToRef: DeepImmutable[js.Function2[/* scale */ Double, /* result */ Matrix, Matrix]]
  
  val scaleToRef: DeepImmutable[js.Function2[/* scale */ Double, /* result */ Matrix, Matrix]]
  
  val setRow: DeepImmutable[js.Function2[/* index */ Double, /* row */ Vector4, Matrix]]
  
  val setRowFromFloats: DeepImmutable[
    js.Function5[/* index */ Double, /* x */ Double, /* y */ Double, /* z */ Double, /* w */ Double, Matrix]
  ]
  
  val setTranslation: DeepImmutable[js.Function1[/* vector3 */ DeepImmutable[Vector3], Matrix]]
  
  val setTranslationFromFloats: DeepImmutable[js.Function3[/* x */ Double, /* y */ Double, /* z */ Double, Matrix]]
  
  val toArray: DeepImmutable[js.Function0[DeepImmutable[js.typedarray.Float32Array | js.Array[Double]]]]
  
  val toNormalMatrix: DeepImmutable[js.Function1[/* ref */ Matrix, Unit]]
  
  val toggleModelMatrixHandInPlace: DeepImmutable[js.Function0[Unit]]
  
  val toggleProjectionMatrixHandInPlace: DeepImmutable[js.Function0[Unit]]
  
  val transpose: DeepImmutable[js.Function0[Matrix]]
  
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
    add: DeepImmutable[js.Function1[/* other */ DeepImmutable[Matrix], Matrix]],
    addAtIndex: DeepImmutable[js.Function2[/* index */ Double, /* value */ Double, Matrix]],
    addToRef: DeepImmutable[js.Function2[/* other */ DeepImmutable[Matrix], /* result */ Matrix, Matrix]],
    addToSelf: DeepImmutable[js.Function1[/* other */ DeepImmutable[Matrix], Matrix]],
    addTranslationFromFloats: DeepImmutable[js.Function3[/* x */ Double, /* y */ Double, /* z */ Double, Matrix]],
    asArray: DeepImmutable[js.Function0[DeepImmutable[js.typedarray.Float32Array | js.Array[Double]]]],
    clone_ : DeepImmutable[js.Function0[Matrix]],
    copyFrom: DeepImmutable[js.Function1[/* other */ DeepImmutable[Matrix], Matrix]],
    copyToArray: DeepImmutable[
      js.Function2[
        /* array */ js.typedarray.Float32Array | js.Array[Double], 
        /* offset */ js.UndefOr[Double], 
        Matrix
      ]
    ],
    decompose: DeepImmutable[
      js.Function4[
        /* scale */ js.UndefOr[Vector3], 
        /* rotation */ js.UndefOr[Quaternion], 
        /* translation */ js.UndefOr[Vector3], 
        /* preserveScalingNode */ js.UndefOr[TransformNode], 
        Boolean
      ]
    ],
    decomposeToTransformNode: DeepImmutable[js.Function1[/* node */ TransformNode, Boolean]],
    determinant: DeepImmutable[js.Function0[Double]],
    equals_ : DeepImmutable[js.Function1[/* value */ DeepImmutable[Matrix], Boolean]],
    getClassName: DeepImmutable[js.Function0[String]],
    getHashCode: DeepImmutable[js.Function0[Double]],
    getRotationMatrix: DeepImmutable[js.Function0[Matrix]],
    getRotationMatrixToRef: DeepImmutable[js.Function1[/* result */ Matrix, Matrix]],
    getRow: DeepImmutable[js.Function1[/* index */ Double, Nullable[Vector4]]],
    getRowToRef: DeepImmutable[js.Function2[/* index */ Double, /* rowVector */ Vector4, Matrix]],
    getTranslation: DeepImmutable[js.Function0[Vector3]],
    getTranslationToRef: DeepImmutable[js.Function1[/* result */ Vector3, Matrix]],
    invert: DeepImmutable[js.Function0[Matrix]],
    invertToRef: DeepImmutable[js.Function1[/* other */ Matrix, Matrix]],
    isIdentity: DeepImmutable[js.Function0[Boolean]],
    isIdentityAs3x2: DeepImmutable[js.Function0[Boolean]],
    m: DeepImmutable[js.Function0[DeepImmutable[js.typedarray.Float32Array | js.Array[Double]]]],
    markAsUpdated: DeepImmutable[js.Function0[Unit]],
    multiply: DeepImmutable[js.Function1[/* other */ DeepImmutable[Matrix], Matrix]],
    multiplyAtIndex: DeepImmutable[js.Function2[/* index */ Double, /* value */ Double, Matrix]],
    multiplyToArray: DeepImmutable[
      js.Function3[
        /* other */ DeepImmutable[Matrix], 
        /* result */ js.typedarray.Float32Array | js.Array[Double], 
        /* offset */ Double, 
        Matrix
      ]
    ],
    multiplyToRef: DeepImmutable[js.Function2[/* other */ DeepImmutable[Matrix], /* result */ Matrix, Matrix]],
    removeRotationAndScaling: DeepImmutable[js.Function0[Matrix]],
    reset: DeepImmutable[js.Function0[Matrix]],
    scale: DeepImmutable[js.Function1[/* scale */ Double, Matrix]],
    scaleAndAddToRef: DeepImmutable[js.Function2[/* scale */ Double, /* result */ Matrix, Matrix]],
    scaleToRef: DeepImmutable[js.Function2[/* scale */ Double, /* result */ Matrix, Matrix]],
    setRow: DeepImmutable[js.Function2[/* index */ Double, /* row */ Vector4, Matrix]],
    setRowFromFloats: DeepImmutable[
      js.Function5[/* index */ Double, /* x */ Double, /* y */ Double, /* z */ Double, /* w */ Double, Matrix]
    ],
    setTranslation: DeepImmutable[js.Function1[/* vector3 */ DeepImmutable[Vector3], Matrix]],
    setTranslationFromFloats: DeepImmutable[js.Function3[/* x */ Double, /* y */ Double, /* z */ Double, Matrix]],
    toArray: DeepImmutable[js.Function0[DeepImmutable[js.typedarray.Float32Array | js.Array[Double]]]],
    toNormalMatrix: DeepImmutable[js.Function1[/* ref */ Matrix, Unit]],
    toggleModelMatrixHandInPlace: DeepImmutable[js.Function0[Unit]],
    toggleProjectionMatrixHandInPlace: DeepImmutable[js.Function0[Unit]],
    transpose: DeepImmutable[js.Function0[Matrix]],
    transposeToRef: DeepImmutable[js.Function1[/* result */ Matrix, Matrix]],
    updateFlag: DeepImmutable[Double]
  ): DeepImmutableObjectMatrixAdd = {
    val __obj = js.Dynamic.literal(_isIdentity = _isIdentity.asInstanceOf[js.Any], _isIdentity3x2 = _isIdentity3x2.asInstanceOf[js.Any], _isIdentity3x2Dirty = _isIdentity3x2Dirty.asInstanceOf[js.Any], _isIdentityDirty = _isIdentityDirty.asInstanceOf[js.Any], _m = _m.asInstanceOf[js.Any], _updateIdentityStatus = _updateIdentityStatus.asInstanceOf[js.Any], add = add.asInstanceOf[js.Any], addAtIndex = addAtIndex.asInstanceOf[js.Any], addToRef = addToRef.asInstanceOf[js.Any], addToSelf = addToSelf.asInstanceOf[js.Any], addTranslationFromFloats = addTranslationFromFloats.asInstanceOf[js.Any], asArray = asArray.asInstanceOf[js.Any], copyFrom = copyFrom.asInstanceOf[js.Any], copyToArray = copyToArray.asInstanceOf[js.Any], decompose = decompose.asInstanceOf[js.Any], decomposeToTransformNode = decomposeToTransformNode.asInstanceOf[js.Any], determinant = determinant.asInstanceOf[js.Any], getClassName = getClassName.asInstanceOf[js.Any], getHashCode = getHashCode.asInstanceOf[js.Any], getRotationMatrix = getRotationMatrix.asInstanceOf[js.Any], getRotationMatrixToRef = getRotationMatrixToRef.asInstanceOf[js.Any], getRow = getRow.asInstanceOf[js.Any], getRowToRef = getRowToRef.asInstanceOf[js.Any], getTranslation = getTranslation.asInstanceOf[js.Any], getTranslationToRef = getTranslationToRef.asInstanceOf[js.Any], invert = invert.asInstanceOf[js.Any], invertToRef = invertToRef.asInstanceOf[js.Any], isIdentity = isIdentity.asInstanceOf[js.Any], isIdentityAs3x2 = isIdentityAs3x2.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], markAsUpdated = markAsUpdated.asInstanceOf[js.Any], multiply = multiply.asInstanceOf[js.Any], multiplyAtIndex = multiplyAtIndex.asInstanceOf[js.Any], multiplyToArray = multiplyToArray.asInstanceOf[js.Any], multiplyToRef = multiplyToRef.asInstanceOf[js.Any], removeRotationAndScaling = removeRotationAndScaling.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], scaleAndAddToRef = scaleAndAddToRef.asInstanceOf[js.Any], scaleToRef = scaleToRef.asInstanceOf[js.Any], setRow = setRow.asInstanceOf[js.Any], setRowFromFloats = setRowFromFloats.asInstanceOf[js.Any], setTranslation = setTranslation.asInstanceOf[js.Any], setTranslationFromFloats = setTranslationFromFloats.asInstanceOf[js.Any], toArray = toArray.asInstanceOf[js.Any], toNormalMatrix = toNormalMatrix.asInstanceOf[js.Any], toggleModelMatrixHandInPlace = toggleModelMatrixHandInPlace.asInstanceOf[js.Any], toggleProjectionMatrixHandInPlace = toggleProjectionMatrixHandInPlace.asInstanceOf[js.Any], transpose = transpose.asInstanceOf[js.Any], transposeToRef = transposeToRef.asInstanceOf[js.Any], updateFlag = updateFlag.asInstanceOf[js.Any])
    __obj.updateDynamic("clone")(clone_.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(equals_.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepImmutableObjectMatrixAdd]
  }
  
  extension [Self <: DeepImmutableObjectMatrixAdd](x: Self) {
    
    inline def setAdd(value: DeepImmutable[js.Function1[/* other */ DeepImmutable[Matrix], Matrix]]): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setAddAtIndex(value: DeepImmutable[js.Function2[/* index */ Double, /* value */ Double, Matrix]]): Self = StObject.set(x, "addAtIndex", value.asInstanceOf[js.Any])
    
    inline def setAddToRef(value: DeepImmutable[js.Function2[/* other */ DeepImmutable[Matrix], /* result */ Matrix, Matrix]]): Self = StObject.set(x, "addToRef", value.asInstanceOf[js.Any])
    
    inline def setAddToSelf(value: DeepImmutable[js.Function1[/* other */ DeepImmutable[Matrix], Matrix]]): Self = StObject.set(x, "addToSelf", value.asInstanceOf[js.Any])
    
    inline def setAddTranslationFromFloats(value: DeepImmutable[js.Function3[/* x */ Double, /* y */ Double, /* z */ Double, Matrix]]): Self = StObject.set(x, "addTranslationFromFloats", value.asInstanceOf[js.Any])
    
    inline def setAsArray(value: DeepImmutable[js.Function0[DeepImmutable[js.typedarray.Float32Array | js.Array[Double]]]]): Self = StObject.set(x, "asArray", value.asInstanceOf[js.Any])
    
    inline def setClone_(value: DeepImmutable[js.Function0[Matrix]]): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
    
    inline def setCopyFrom(value: DeepImmutable[js.Function1[/* other */ DeepImmutable[Matrix], Matrix]]): Self = StObject.set(x, "copyFrom", value.asInstanceOf[js.Any])
    
    inline def setCopyToArray(
      value: DeepImmutable[
          js.Function2[
            /* array */ js.typedarray.Float32Array | js.Array[Double], 
            /* offset */ js.UndefOr[Double], 
            Matrix
          ]
        ]
    ): Self = StObject.set(x, "copyToArray", value.asInstanceOf[js.Any])
    
    inline def setDecompose(
      value: DeepImmutable[
          js.Function4[
            /* scale */ js.UndefOr[Vector3], 
            /* rotation */ js.UndefOr[Quaternion], 
            /* translation */ js.UndefOr[Vector3], 
            /* preserveScalingNode */ js.UndefOr[TransformNode], 
            Boolean
          ]
        ]
    ): Self = StObject.set(x, "decompose", value.asInstanceOf[js.Any])
    
    inline def setDecomposeToTransformNode(value: DeepImmutable[js.Function1[/* node */ TransformNode, Boolean]]): Self = StObject.set(x, "decomposeToTransformNode", value.asInstanceOf[js.Any])
    
    inline def setDeterminant(value: DeepImmutable[js.Function0[Double]]): Self = StObject.set(x, "determinant", value.asInstanceOf[js.Any])
    
    inline def setEquals_(value: DeepImmutable[js.Function1[/* value */ DeepImmutable[Matrix], Boolean]]): Self = StObject.set(x, "equals", value.asInstanceOf[js.Any])
    
    inline def setGetClassName(value: DeepImmutable[js.Function0[String]]): Self = StObject.set(x, "getClassName", value.asInstanceOf[js.Any])
    
    inline def setGetHashCode(value: DeepImmutable[js.Function0[Double]]): Self = StObject.set(x, "getHashCode", value.asInstanceOf[js.Any])
    
    inline def setGetRotationMatrix(value: DeepImmutable[js.Function0[Matrix]]): Self = StObject.set(x, "getRotationMatrix", value.asInstanceOf[js.Any])
    
    inline def setGetRotationMatrixToRef(value: DeepImmutable[js.Function1[/* result */ Matrix, Matrix]]): Self = StObject.set(x, "getRotationMatrixToRef", value.asInstanceOf[js.Any])
    
    inline def setGetRow(value: DeepImmutable[js.Function1[/* index */ Double, Nullable[Vector4]]]): Self = StObject.set(x, "getRow", value.asInstanceOf[js.Any])
    
    inline def setGetRowToRef(value: DeepImmutable[js.Function2[/* index */ Double, /* rowVector */ Vector4, Matrix]]): Self = StObject.set(x, "getRowToRef", value.asInstanceOf[js.Any])
    
    inline def setGetTranslation(value: DeepImmutable[js.Function0[Vector3]]): Self = StObject.set(x, "getTranslation", value.asInstanceOf[js.Any])
    
    inline def setGetTranslationToRef(value: DeepImmutable[js.Function1[/* result */ Vector3, Matrix]]): Self = StObject.set(x, "getTranslationToRef", value.asInstanceOf[js.Any])
    
    inline def setInvert(value: DeepImmutable[js.Function0[Matrix]]): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
    
    inline def setInvertToRef(value: DeepImmutable[js.Function1[/* other */ Matrix, Matrix]]): Self = StObject.set(x, "invertToRef", value.asInstanceOf[js.Any])
    
    inline def setIsIdentity(value: DeepImmutable[js.Function0[Boolean]]): Self = StObject.set(x, "isIdentity", value.asInstanceOf[js.Any])
    
    inline def setIsIdentityAs3x2(value: DeepImmutable[js.Function0[Boolean]]): Self = StObject.set(x, "isIdentityAs3x2", value.asInstanceOf[js.Any])
    
    inline def setM(value: DeepImmutable[js.Function0[DeepImmutable[js.typedarray.Float32Array | js.Array[Double]]]]): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
    
    inline def setMarkAsUpdated(value: DeepImmutable[js.Function0[Unit]]): Self = StObject.set(x, "markAsUpdated", value.asInstanceOf[js.Any])
    
    inline def setMultiply(value: DeepImmutable[js.Function1[/* other */ DeepImmutable[Matrix], Matrix]]): Self = StObject.set(x, "multiply", value.asInstanceOf[js.Any])
    
    inline def setMultiplyAtIndex(value: DeepImmutable[js.Function2[/* index */ Double, /* value */ Double, Matrix]]): Self = StObject.set(x, "multiplyAtIndex", value.asInstanceOf[js.Any])
    
    inline def setMultiplyToArray(
      value: DeepImmutable[
          js.Function3[
            /* other */ DeepImmutable[Matrix], 
            /* result */ js.typedarray.Float32Array | js.Array[Double], 
            /* offset */ Double, 
            Matrix
          ]
        ]
    ): Self = StObject.set(x, "multiplyToArray", value.asInstanceOf[js.Any])
    
    inline def setMultiplyToRef(value: DeepImmutable[js.Function2[/* other */ DeepImmutable[Matrix], /* result */ Matrix, Matrix]]): Self = StObject.set(x, "multiplyToRef", value.asInstanceOf[js.Any])
    
    inline def setRemoveRotationAndScaling(value: DeepImmutable[js.Function0[Matrix]]): Self = StObject.set(x, "removeRotationAndScaling", value.asInstanceOf[js.Any])
    
    inline def setReset(value: DeepImmutable[js.Function0[Matrix]]): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    inline def setScale(value: DeepImmutable[js.Function1[/* scale */ Double, Matrix]]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleAndAddToRef(value: DeepImmutable[js.Function2[/* scale */ Double, /* result */ Matrix, Matrix]]): Self = StObject.set(x, "scaleAndAddToRef", value.asInstanceOf[js.Any])
    
    inline def setScaleToRef(value: DeepImmutable[js.Function2[/* scale */ Double, /* result */ Matrix, Matrix]]): Self = StObject.set(x, "scaleToRef", value.asInstanceOf[js.Any])
    
    inline def setSetRow(value: DeepImmutable[js.Function2[/* index */ Double, /* row */ Vector4, Matrix]]): Self = StObject.set(x, "setRow", value.asInstanceOf[js.Any])
    
    inline def setSetRowFromFloats(
      value: DeepImmutable[
          js.Function5[/* index */ Double, /* x */ Double, /* y */ Double, /* z */ Double, /* w */ Double, Matrix]
        ]
    ): Self = StObject.set(x, "setRowFromFloats", value.asInstanceOf[js.Any])
    
    inline def setSetTranslation(value: DeepImmutable[js.Function1[/* vector3 */ DeepImmutable[Vector3], Matrix]]): Self = StObject.set(x, "setTranslation", value.asInstanceOf[js.Any])
    
    inline def setSetTranslationFromFloats(value: DeepImmutable[js.Function3[/* x */ Double, /* y */ Double, /* z */ Double, Matrix]]): Self = StObject.set(x, "setTranslationFromFloats", value.asInstanceOf[js.Any])
    
    inline def setToArray(value: DeepImmutable[js.Function0[DeepImmutable[js.typedarray.Float32Array | js.Array[Double]]]]): Self = StObject.set(x, "toArray", value.asInstanceOf[js.Any])
    
    inline def setToNormalMatrix(value: DeepImmutable[js.Function1[/* ref */ Matrix, Unit]]): Self = StObject.set(x, "toNormalMatrix", value.asInstanceOf[js.Any])
    
    inline def setToggleModelMatrixHandInPlace(value: DeepImmutable[js.Function0[Unit]]): Self = StObject.set(x, "toggleModelMatrixHandInPlace", value.asInstanceOf[js.Any])
    
    inline def setToggleProjectionMatrixHandInPlace(value: DeepImmutable[js.Function0[Unit]]): Self = StObject.set(x, "toggleProjectionMatrixHandInPlace", value.asInstanceOf[js.Any])
    
    inline def setTranspose(value: DeepImmutable[js.Function0[Matrix]]): Self = StObject.set(x, "transpose", value.asInstanceOf[js.Any])
    
    inline def setTransposeToRef(value: DeepImmutable[js.Function1[/* result */ Matrix, Matrix]]): Self = StObject.set(x, "transposeToRef", value.asInstanceOf[js.Any])
    
    inline def setUpdateFlag(value: DeepImmutable[Double]): Self = StObject.set(x, "updateFlag", value.asInstanceOf[js.Any])
    
    inline def set_isIdentity(value: DeepImmutable[Any]): Self = StObject.set(x, "_isIdentity", value.asInstanceOf[js.Any])
    
    inline def set_isIdentity3x2(value: DeepImmutable[Any]): Self = StObject.set(x, "_isIdentity3x2", value.asInstanceOf[js.Any])
    
    inline def set_isIdentity3x2Dirty(value: DeepImmutable[Any]): Self = StObject.set(x, "_isIdentity3x2Dirty", value.asInstanceOf[js.Any])
    
    inline def set_isIdentityDirty(value: DeepImmutable[Any]): Self = StObject.set(x, "_isIdentityDirty", value.asInstanceOf[js.Any])
    
    inline def set_m(value: DeepImmutable[Any]): Self = StObject.set(x, "_m", value.asInstanceOf[js.Any])
    
    inline def set_updateIdentityStatus(value: DeepImmutable[Any]): Self = StObject.set(x, "_updateIdentityStatus", value.asInstanceOf[js.Any])
  }
}

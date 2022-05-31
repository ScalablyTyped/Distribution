package typings.babylonjs.anon

import typings.babylonjs.BABYLON.DeepImmutable
import typings.babylonjs.BABYLON.Matrix
import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.BABYLON.Quaternion
import typings.babylonjs.BABYLON.Vector3
import typings.babylonjs.BABYLON.Vector4
import typings.std.Float32Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined babylonjs.BABYLON.DeepImmutableObject<babylonjs.BABYLON.Matrix> */
trait DeepImmutableObjectMatrixAdd extends StObject {
  
  val _isIdentity: DeepImmutable[js.Any]
  
  val _isIdentity3x2: DeepImmutable[js.Any]
  
  val _isIdentity3x2Dirty: DeepImmutable[js.Any]
  
  val _isIdentityDirty: DeepImmutable[js.Any]
  
  val _m: DeepImmutable[js.Any]
  
  val _markAsUpdated: DeepImmutable[js.Function0[Unit]]
  
  val _updateIdentityStatus: DeepImmutable[js.Any]
  
  val add: DeepImmutable[js.Function1[/* other */ DeepImmutable[Matrix], Matrix]]
  
  val addAtIndex: DeepImmutable[js.Function2[/* index */ Double, /* value */ Double, Matrix]]
  
  val addToRef: DeepImmutable[js.Function2[/* other */ DeepImmutable[Matrix], /* result */ Matrix, Matrix]]
  
  val addToSelf: DeepImmutable[js.Function1[/* other */ DeepImmutable[Matrix], Matrix]]
  
  val addTranslationFromFloats: DeepImmutable[js.Function3[/* x */ Double, /* y */ Double, /* z */ Double, Matrix]]
  
  val asArray: DeepImmutable[js.Function0[DeepImmutable[Float32Array | js.Array[Double]]]]
  
  @JSName("clone")
  val clone_FDeepImmutableObjectMatrixAdd: DeepImmutable[js.Function0[Matrix]]
  
  val copyFrom: DeepImmutable[js.Function1[/* other */ DeepImmutable[Matrix], Matrix]]
  
  val copyToArray: DeepImmutable[
    js.Function2[/* array */ Float32Array | js.Array[Double], /* offset */ js.UndefOr[Double], Matrix]
  ]
  
  val decompose: DeepImmutable[
    js.Function3[
      /* scale */ js.UndefOr[Vector3], 
      /* rotation */ js.UndefOr[Quaternion], 
      /* translation */ js.UndefOr[Vector3], 
      Boolean
    ]
  ]
  
  val determinant: DeepImmutable[js.Function0[Double]]
  
  @JSName("equals")
  val equals_FDeepImmutableObjectMatrixAdd: DeepImmutable[js.Function1[/* value */ DeepImmutable[Matrix], Boolean]]
  
  val getClassName: DeepImmutable[js.Function0[String]]
  
  val getHashCode: DeepImmutable[js.Function0[Double]]
  
  val getRotationMatrix: DeepImmutable[js.Function0[Matrix]]
  
  val getRotationMatrixToRef: DeepImmutable[js.Function1[/* result */ Matrix, Matrix]]
  
  val getRow: DeepImmutable[js.Function1[/* index */ Double, Nullable[Vector4]]]
  
  val getTranslation: DeepImmutable[js.Function0[Vector3]]
  
  val getTranslationToRef: DeepImmutable[js.Function1[/* result */ Vector3, Matrix]]
  
  val invert: DeepImmutable[js.Function0[Matrix]]
  
  val invertToRef: DeepImmutable[js.Function1[/* other */ Matrix, Matrix]]
  
  val isIdentity: DeepImmutable[js.Function0[Boolean]]
  
  val isIdentityAs3x2: DeepImmutable[js.Function0[Boolean]]
  
  val m: DeepImmutable[js.Function0[DeepImmutable[Float32Array | js.Array[Double]]]]
  
  val multiply: DeepImmutable[js.Function1[/* other */ DeepImmutable[Matrix], Matrix]]
  
  val multiplyAtIndex: DeepImmutable[js.Function2[/* index */ Double, /* value */ Double, Matrix]]
  
  val multiplyToArray: DeepImmutable[
    js.Function3[
      /* other */ DeepImmutable[Matrix], 
      /* result */ Float32Array | js.Array[Double], 
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
  
  val toArray: DeepImmutable[js.Function0[DeepImmutable[Float32Array | js.Array[Double]]]]
  
  val toNormalMatrix: DeepImmutable[js.Function1[/* ref */ Matrix, Unit]]
  
  val toggleModelMatrixHandInPlace: DeepImmutable[js.Function0[Unit]]
  
  val toggleProjectionMatrixHandInPlace: DeepImmutable[js.Function0[Unit]]
  
  val transpose: DeepImmutable[js.Function0[Matrix]]
  
  val transposeToRef: DeepImmutable[js.Function1[/* result */ Matrix, Matrix]]
  
  val updateFlag: DeepImmutable[Double]
}
object DeepImmutableObjectMatrixAdd {
  
  inline def apply(
    _isIdentity: DeepImmutable[js.Any],
    _isIdentity3x2: DeepImmutable[js.Any],
    _isIdentity3x2Dirty: DeepImmutable[js.Any],
    _isIdentityDirty: DeepImmutable[js.Any],
    _m: DeepImmutable[js.Any],
    _markAsUpdated: DeepImmutable[js.Function0[Unit]],
    _updateIdentityStatus: DeepImmutable[js.Any],
    add: DeepImmutable[js.Function1[/* other */ DeepImmutable[Matrix], Matrix]],
    addAtIndex: DeepImmutable[js.Function2[/* index */ Double, /* value */ Double, Matrix]],
    addToRef: DeepImmutable[js.Function2[/* other */ DeepImmutable[Matrix], /* result */ Matrix, Matrix]],
    addToSelf: DeepImmutable[js.Function1[/* other */ DeepImmutable[Matrix], Matrix]],
    addTranslationFromFloats: DeepImmutable[js.Function3[/* x */ Double, /* y */ Double, /* z */ Double, Matrix]],
    asArray: DeepImmutable[js.Function0[DeepImmutable[Float32Array | js.Array[Double]]]],
    clone_ : DeepImmutable[js.Function0[Matrix]],
    copyFrom: DeepImmutable[js.Function1[/* other */ DeepImmutable[Matrix], Matrix]],
    copyToArray: DeepImmutable[
      js.Function2[/* array */ Float32Array | js.Array[Double], /* offset */ js.UndefOr[Double], Matrix]
    ],
    decompose: DeepImmutable[
      js.Function3[
        /* scale */ js.UndefOr[Vector3], 
        /* rotation */ js.UndefOr[Quaternion], 
        /* translation */ js.UndefOr[Vector3], 
        Boolean
      ]
    ],
    determinant: DeepImmutable[js.Function0[Double]],
    equals_ : DeepImmutable[js.Function1[/* value */ DeepImmutable[Matrix], Boolean]],
    getClassName: DeepImmutable[js.Function0[String]],
    getHashCode: DeepImmutable[js.Function0[Double]],
    getRotationMatrix: DeepImmutable[js.Function0[Matrix]],
    getRotationMatrixToRef: DeepImmutable[js.Function1[/* result */ Matrix, Matrix]],
    getRow: DeepImmutable[js.Function1[/* index */ Double, Nullable[Vector4]]],
    getTranslation: DeepImmutable[js.Function0[Vector3]],
    getTranslationToRef: DeepImmutable[js.Function1[/* result */ Vector3, Matrix]],
    invert: DeepImmutable[js.Function0[Matrix]],
    invertToRef: DeepImmutable[js.Function1[/* other */ Matrix, Matrix]],
    isIdentity: DeepImmutable[js.Function0[Boolean]],
    isIdentityAs3x2: DeepImmutable[js.Function0[Boolean]],
    m: DeepImmutable[js.Function0[DeepImmutable[Float32Array | js.Array[Double]]]],
    multiply: DeepImmutable[js.Function1[/* other */ DeepImmutable[Matrix], Matrix]],
    multiplyAtIndex: DeepImmutable[js.Function2[/* index */ Double, /* value */ Double, Matrix]],
    multiplyToArray: DeepImmutable[
      js.Function3[
        /* other */ DeepImmutable[Matrix], 
        /* result */ Float32Array | js.Array[Double], 
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
    toArray: DeepImmutable[js.Function0[DeepImmutable[Float32Array | js.Array[Double]]]],
    toNormalMatrix: DeepImmutable[js.Function1[/* ref */ Matrix, Unit]],
    toggleModelMatrixHandInPlace: DeepImmutable[js.Function0[Unit]],
    toggleProjectionMatrixHandInPlace: DeepImmutable[js.Function0[Unit]],
    transpose: DeepImmutable[js.Function0[Matrix]],
    transposeToRef: DeepImmutable[js.Function1[/* result */ Matrix, Matrix]],
    updateFlag: DeepImmutable[Double]
  ): DeepImmutableObjectMatrixAdd = {
    val __obj = js.Dynamic.literal(_isIdentity = _isIdentity.asInstanceOf[js.Any], _isIdentity3x2 = _isIdentity3x2.asInstanceOf[js.Any], _isIdentity3x2Dirty = _isIdentity3x2Dirty.asInstanceOf[js.Any], _isIdentityDirty = _isIdentityDirty.asInstanceOf[js.Any], _m = _m.asInstanceOf[js.Any], _markAsUpdated = _markAsUpdated.asInstanceOf[js.Any], _updateIdentityStatus = _updateIdentityStatus.asInstanceOf[js.Any], add = add.asInstanceOf[js.Any], addAtIndex = addAtIndex.asInstanceOf[js.Any], addToRef = addToRef.asInstanceOf[js.Any], addToSelf = addToSelf.asInstanceOf[js.Any], addTranslationFromFloats = addTranslationFromFloats.asInstanceOf[js.Any], asArray = asArray.asInstanceOf[js.Any], copyFrom = copyFrom.asInstanceOf[js.Any], copyToArray = copyToArray.asInstanceOf[js.Any], decompose = decompose.asInstanceOf[js.Any], determinant = determinant.asInstanceOf[js.Any], getClassName = getClassName.asInstanceOf[js.Any], getHashCode = getHashCode.asInstanceOf[js.Any], getRotationMatrix = getRotationMatrix.asInstanceOf[js.Any], getRotationMatrixToRef = getRotationMatrixToRef.asInstanceOf[js.Any], getRow = getRow.asInstanceOf[js.Any], getTranslation = getTranslation.asInstanceOf[js.Any], getTranslationToRef = getTranslationToRef.asInstanceOf[js.Any], invert = invert.asInstanceOf[js.Any], invertToRef = invertToRef.asInstanceOf[js.Any], isIdentity = isIdentity.asInstanceOf[js.Any], isIdentityAs3x2 = isIdentityAs3x2.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], multiply = multiply.asInstanceOf[js.Any], multiplyAtIndex = multiplyAtIndex.asInstanceOf[js.Any], multiplyToArray = multiplyToArray.asInstanceOf[js.Any], multiplyToRef = multiplyToRef.asInstanceOf[js.Any], removeRotationAndScaling = removeRotationAndScaling.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], scaleAndAddToRef = scaleAndAddToRef.asInstanceOf[js.Any], scaleToRef = scaleToRef.asInstanceOf[js.Any], setRow = setRow.asInstanceOf[js.Any], setRowFromFloats = setRowFromFloats.asInstanceOf[js.Any], setTranslation = setTranslation.asInstanceOf[js.Any], setTranslationFromFloats = setTranslationFromFloats.asInstanceOf[js.Any], toArray = toArray.asInstanceOf[js.Any], toNormalMatrix = toNormalMatrix.asInstanceOf[js.Any], toggleModelMatrixHandInPlace = toggleModelMatrixHandInPlace.asInstanceOf[js.Any], toggleProjectionMatrixHandInPlace = toggleProjectionMatrixHandInPlace.asInstanceOf[js.Any], transpose = transpose.asInstanceOf[js.Any], transposeToRef = transposeToRef.asInstanceOf[js.Any], updateFlag = updateFlag.asInstanceOf[js.Any])
    __obj.updateDynamic("clone")(clone_.asInstanceOf[js.Any])
    __obj.updateDynamic("equals")(equals_.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepImmutableObjectMatrixAdd]
  }
  
  extension [Self <: DeepImmutableObjectMatrixAdd](x: Self) {
    
    inline def setAdd(value: DeepImmutable[js.Function1[/* other */ DeepImmutable[Matrix], Matrix]]): Self = StObject.set(x, "add", value.asInstanceOf[js.Any])
    
    inline def setAddAtIndex(value: DeepImmutable[js.Function2[/* index */ Double, /* value */ Double, Matrix]]): Self = StObject.set(x, "addAtIndex", value.asInstanceOf[js.Any])
    
    inline def setAddAtIndexFunction2(value: (/* index */ Double, /* value */ Double) => Matrix): Self = StObject.set(x, "addAtIndex", js.Any.fromFunction2(value))
    
    inline def setAddFunction1(value: /* other */ DeepImmutable[Matrix] => Matrix): Self = StObject.set(x, "add", js.Any.fromFunction1(value))
    
    inline def setAddToRef(value: DeepImmutable[js.Function2[/* other */ DeepImmutable[Matrix], /* result */ Matrix, Matrix]]): Self = StObject.set(x, "addToRef", value.asInstanceOf[js.Any])
    
    inline def setAddToRefFunction2(value: (/* other */ DeepImmutable[Matrix], /* result */ Matrix) => Matrix): Self = StObject.set(x, "addToRef", js.Any.fromFunction2(value))
    
    inline def setAddToSelf(value: DeepImmutable[js.Function1[/* other */ DeepImmutable[Matrix], Matrix]]): Self = StObject.set(x, "addToSelf", value.asInstanceOf[js.Any])
    
    inline def setAddToSelfFunction1(value: /* other */ DeepImmutable[Matrix] => Matrix): Self = StObject.set(x, "addToSelf", js.Any.fromFunction1(value))
    
    inline def setAddTranslationFromFloats(value: DeepImmutable[js.Function3[/* x */ Double, /* y */ Double, /* z */ Double, Matrix]]): Self = StObject.set(x, "addTranslationFromFloats", value.asInstanceOf[js.Any])
    
    inline def setAddTranslationFromFloatsFunction3(value: (/* x */ Double, /* y */ Double, /* z */ Double) => Matrix): Self = StObject.set(x, "addTranslationFromFloats", js.Any.fromFunction3(value))
    
    inline def setAsArray(value: DeepImmutable[js.Function0[DeepImmutable[Float32Array | js.Array[Double]]]]): Self = StObject.set(x, "asArray", value.asInstanceOf[js.Any])
    
    inline def setAsArrayFunction0(value: () => DeepImmutable[Float32Array | js.Array[Double]]): Self = StObject.set(x, "asArray", js.Any.fromFunction0(value))
    
    inline def setClone_(value: DeepImmutable[js.Function0[Matrix]]): Self = StObject.set(x, "clone", value.asInstanceOf[js.Any])
    
    inline def setClone_Function0(value: () => Matrix): Self = StObject.set(x, "clone", js.Any.fromFunction0(value))
    
    inline def setCopyFrom(value: DeepImmutable[js.Function1[/* other */ DeepImmutable[Matrix], Matrix]]): Self = StObject.set(x, "copyFrom", value.asInstanceOf[js.Any])
    
    inline def setCopyFromFunction1(value: /* other */ DeepImmutable[Matrix] => Matrix): Self = StObject.set(x, "copyFrom", js.Any.fromFunction1(value))
    
    inline def setCopyToArray(
      value: DeepImmutable[
          js.Function2[/* array */ Float32Array | js.Array[Double], /* offset */ js.UndefOr[Double], Matrix]
        ]
    ): Self = StObject.set(x, "copyToArray", value.asInstanceOf[js.Any])
    
    inline def setCopyToArrayFunction2(value: (/* array */ Float32Array | js.Array[Double], /* offset */ js.UndefOr[Double]) => Matrix): Self = StObject.set(x, "copyToArray", js.Any.fromFunction2(value))
    
    inline def setDecompose(
      value: DeepImmutable[
          js.Function3[
            /* scale */ js.UndefOr[Vector3], 
            /* rotation */ js.UndefOr[Quaternion], 
            /* translation */ js.UndefOr[Vector3], 
            Boolean
          ]
        ]
    ): Self = StObject.set(x, "decompose", value.asInstanceOf[js.Any])
    
    inline def setDecomposeFunction3(
      value: (/* scale */ js.UndefOr[Vector3], /* rotation */ js.UndefOr[Quaternion], /* translation */ js.UndefOr[Vector3]) => Boolean
    ): Self = StObject.set(x, "decompose", js.Any.fromFunction3(value))
    
    inline def setDeterminant(value: DeepImmutable[js.Function0[Double]]): Self = StObject.set(x, "determinant", value.asInstanceOf[js.Any])
    
    inline def setDeterminantFunction0(value: () => Double): Self = StObject.set(x, "determinant", js.Any.fromFunction0(value))
    
    inline def setEquals_(value: DeepImmutable[js.Function1[/* value */ DeepImmutable[Matrix], Boolean]]): Self = StObject.set(x, "equals", value.asInstanceOf[js.Any])
    
    inline def setEquals_Function1(value: /* value */ DeepImmutable[Matrix] => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction1(value))
    
    inline def setGetClassName(value: DeepImmutable[js.Function0[String]]): Self = StObject.set(x, "getClassName", value.asInstanceOf[js.Any])
    
    inline def setGetClassNameFunction0(value: () => String): Self = StObject.set(x, "getClassName", js.Any.fromFunction0(value))
    
    inline def setGetHashCode(value: DeepImmutable[js.Function0[Double]]): Self = StObject.set(x, "getHashCode", value.asInstanceOf[js.Any])
    
    inline def setGetHashCodeFunction0(value: () => Double): Self = StObject.set(x, "getHashCode", js.Any.fromFunction0(value))
    
    inline def setGetRotationMatrix(value: DeepImmutable[js.Function0[Matrix]]): Self = StObject.set(x, "getRotationMatrix", value.asInstanceOf[js.Any])
    
    inline def setGetRotationMatrixFunction0(value: () => Matrix): Self = StObject.set(x, "getRotationMatrix", js.Any.fromFunction0(value))
    
    inline def setGetRotationMatrixToRef(value: DeepImmutable[js.Function1[/* result */ Matrix, Matrix]]): Self = StObject.set(x, "getRotationMatrixToRef", value.asInstanceOf[js.Any])
    
    inline def setGetRotationMatrixToRefFunction1(value: /* result */ Matrix => Matrix): Self = StObject.set(x, "getRotationMatrixToRef", js.Any.fromFunction1(value))
    
    inline def setGetRow(value: DeepImmutable[js.Function1[/* index */ Double, Nullable[Vector4]]]): Self = StObject.set(x, "getRow", value.asInstanceOf[js.Any])
    
    inline def setGetRowFunction1(value: /* index */ Double => Nullable[Vector4]): Self = StObject.set(x, "getRow", js.Any.fromFunction1(value))
    
    inline def setGetTranslation(value: DeepImmutable[js.Function0[Vector3]]): Self = StObject.set(x, "getTranslation", value.asInstanceOf[js.Any])
    
    inline def setGetTranslationFunction0(value: () => Vector3): Self = StObject.set(x, "getTranslation", js.Any.fromFunction0(value))
    
    inline def setGetTranslationToRef(value: DeepImmutable[js.Function1[/* result */ Vector3, Matrix]]): Self = StObject.set(x, "getTranslationToRef", value.asInstanceOf[js.Any])
    
    inline def setGetTranslationToRefFunction1(value: /* result */ Vector3 => Matrix): Self = StObject.set(x, "getTranslationToRef", js.Any.fromFunction1(value))
    
    inline def setInvert(value: DeepImmutable[js.Function0[Matrix]]): Self = StObject.set(x, "invert", value.asInstanceOf[js.Any])
    
    inline def setInvertFunction0(value: () => Matrix): Self = StObject.set(x, "invert", js.Any.fromFunction0(value))
    
    inline def setInvertToRef(value: DeepImmutable[js.Function1[/* other */ Matrix, Matrix]]): Self = StObject.set(x, "invertToRef", value.asInstanceOf[js.Any])
    
    inline def setInvertToRefFunction1(value: /* other */ Matrix => Matrix): Self = StObject.set(x, "invertToRef", js.Any.fromFunction1(value))
    
    inline def setIsIdentity(value: DeepImmutable[js.Function0[Boolean]]): Self = StObject.set(x, "isIdentity", value.asInstanceOf[js.Any])
    
    inline def setIsIdentityAs3x2(value: DeepImmutable[js.Function0[Boolean]]): Self = StObject.set(x, "isIdentityAs3x2", value.asInstanceOf[js.Any])
    
    inline def setIsIdentityAs3x2Function0(value: () => Boolean): Self = StObject.set(x, "isIdentityAs3x2", js.Any.fromFunction0(value))
    
    inline def setIsIdentityFunction0(value: () => Boolean): Self = StObject.set(x, "isIdentity", js.Any.fromFunction0(value))
    
    inline def setM(value: DeepImmutable[js.Function0[DeepImmutable[Float32Array | js.Array[Double]]]]): Self = StObject.set(x, "m", value.asInstanceOf[js.Any])
    
    inline def setMFunction0(value: () => DeepImmutable[Float32Array | js.Array[Double]]): Self = StObject.set(x, "m", js.Any.fromFunction0(value))
    
    inline def setMultiply(value: DeepImmutable[js.Function1[/* other */ DeepImmutable[Matrix], Matrix]]): Self = StObject.set(x, "multiply", value.asInstanceOf[js.Any])
    
    inline def setMultiplyAtIndex(value: DeepImmutable[js.Function2[/* index */ Double, /* value */ Double, Matrix]]): Self = StObject.set(x, "multiplyAtIndex", value.asInstanceOf[js.Any])
    
    inline def setMultiplyAtIndexFunction2(value: (/* index */ Double, /* value */ Double) => Matrix): Self = StObject.set(x, "multiplyAtIndex", js.Any.fromFunction2(value))
    
    inline def setMultiplyFunction1(value: /* other */ DeepImmutable[Matrix] => Matrix): Self = StObject.set(x, "multiply", js.Any.fromFunction1(value))
    
    inline def setMultiplyToArray(
      value: DeepImmutable[
          js.Function3[
            /* other */ DeepImmutable[Matrix], 
            /* result */ Float32Array | js.Array[Double], 
            /* offset */ Double, 
            Matrix
          ]
        ]
    ): Self = StObject.set(x, "multiplyToArray", value.asInstanceOf[js.Any])
    
    inline def setMultiplyToArrayFunction3(
      value: (/* other */ DeepImmutable[Matrix], /* result */ Float32Array | js.Array[Double], /* offset */ Double) => Matrix
    ): Self = StObject.set(x, "multiplyToArray", js.Any.fromFunction3(value))
    
    inline def setMultiplyToRef(value: DeepImmutable[js.Function2[/* other */ DeepImmutable[Matrix], /* result */ Matrix, Matrix]]): Self = StObject.set(x, "multiplyToRef", value.asInstanceOf[js.Any])
    
    inline def setMultiplyToRefFunction2(value: (/* other */ DeepImmutable[Matrix], /* result */ Matrix) => Matrix): Self = StObject.set(x, "multiplyToRef", js.Any.fromFunction2(value))
    
    inline def setRemoveRotationAndScaling(value: DeepImmutable[js.Function0[Matrix]]): Self = StObject.set(x, "removeRotationAndScaling", value.asInstanceOf[js.Any])
    
    inline def setRemoveRotationAndScalingFunction0(value: () => Matrix): Self = StObject.set(x, "removeRotationAndScaling", js.Any.fromFunction0(value))
    
    inline def setReset(value: DeepImmutable[js.Function0[Matrix]]): Self = StObject.set(x, "reset", value.asInstanceOf[js.Any])
    
    inline def setResetFunction0(value: () => Matrix): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
    
    inline def setScale(value: DeepImmutable[js.Function1[/* scale */ Double, Matrix]]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    inline def setScaleAndAddToRef(value: DeepImmutable[js.Function2[/* scale */ Double, /* result */ Matrix, Matrix]]): Self = StObject.set(x, "scaleAndAddToRef", value.asInstanceOf[js.Any])
    
    inline def setScaleAndAddToRefFunction2(value: (/* scale */ Double, /* result */ Matrix) => Matrix): Self = StObject.set(x, "scaleAndAddToRef", js.Any.fromFunction2(value))
    
    inline def setScaleFunction1(value: /* scale */ Double => Matrix): Self = StObject.set(x, "scale", js.Any.fromFunction1(value))
    
    inline def setScaleToRef(value: DeepImmutable[js.Function2[/* scale */ Double, /* result */ Matrix, Matrix]]): Self = StObject.set(x, "scaleToRef", value.asInstanceOf[js.Any])
    
    inline def setScaleToRefFunction2(value: (/* scale */ Double, /* result */ Matrix) => Matrix): Self = StObject.set(x, "scaleToRef", js.Any.fromFunction2(value))
    
    inline def setSetRow(value: DeepImmutable[js.Function2[/* index */ Double, /* row */ Vector4, Matrix]]): Self = StObject.set(x, "setRow", value.asInstanceOf[js.Any])
    
    inline def setSetRowFromFloats(
      value: DeepImmutable[
          js.Function5[/* index */ Double, /* x */ Double, /* y */ Double, /* z */ Double, /* w */ Double, Matrix]
        ]
    ): Self = StObject.set(x, "setRowFromFloats", value.asInstanceOf[js.Any])
    
    inline def setSetRowFromFloatsFunction5(
      value: (/* index */ Double, /* x */ Double, /* y */ Double, /* z */ Double, /* w */ Double) => Matrix
    ): Self = StObject.set(x, "setRowFromFloats", js.Any.fromFunction5(value))
    
    inline def setSetRowFunction2(value: (/* index */ Double, /* row */ Vector4) => Matrix): Self = StObject.set(x, "setRow", js.Any.fromFunction2(value))
    
    inline def setSetTranslation(value: DeepImmutable[js.Function1[/* vector3 */ DeepImmutable[Vector3], Matrix]]): Self = StObject.set(x, "setTranslation", value.asInstanceOf[js.Any])
    
    inline def setSetTranslationFromFloats(value: DeepImmutable[js.Function3[/* x */ Double, /* y */ Double, /* z */ Double, Matrix]]): Self = StObject.set(x, "setTranslationFromFloats", value.asInstanceOf[js.Any])
    
    inline def setSetTranslationFromFloatsFunction3(value: (/* x */ Double, /* y */ Double, /* z */ Double) => Matrix): Self = StObject.set(x, "setTranslationFromFloats", js.Any.fromFunction3(value))
    
    inline def setSetTranslationFunction1(value: /* vector3 */ DeepImmutable[Vector3] => Matrix): Self = StObject.set(x, "setTranslation", js.Any.fromFunction1(value))
    
    inline def setToArray(value: DeepImmutable[js.Function0[DeepImmutable[Float32Array | js.Array[Double]]]]): Self = StObject.set(x, "toArray", value.asInstanceOf[js.Any])
    
    inline def setToArrayFunction0(value: () => DeepImmutable[Float32Array | js.Array[Double]]): Self = StObject.set(x, "toArray", js.Any.fromFunction0(value))
    
    inline def setToNormalMatrix(value: DeepImmutable[js.Function1[/* ref */ Matrix, Unit]]): Self = StObject.set(x, "toNormalMatrix", value.asInstanceOf[js.Any])
    
    inline def setToNormalMatrixFunction1(value: /* ref */ Matrix => Unit): Self = StObject.set(x, "toNormalMatrix", js.Any.fromFunction1(value))
    
    inline def setToggleModelMatrixHandInPlace(value: DeepImmutable[js.Function0[Unit]]): Self = StObject.set(x, "toggleModelMatrixHandInPlace", value.asInstanceOf[js.Any])
    
    inline def setToggleModelMatrixHandInPlaceFunction0(value: () => Unit): Self = StObject.set(x, "toggleModelMatrixHandInPlace", js.Any.fromFunction0(value))
    
    inline def setToggleProjectionMatrixHandInPlace(value: DeepImmutable[js.Function0[Unit]]): Self = StObject.set(x, "toggleProjectionMatrixHandInPlace", value.asInstanceOf[js.Any])
    
    inline def setToggleProjectionMatrixHandInPlaceFunction0(value: () => Unit): Self = StObject.set(x, "toggleProjectionMatrixHandInPlace", js.Any.fromFunction0(value))
    
    inline def setTranspose(value: DeepImmutable[js.Function0[Matrix]]): Self = StObject.set(x, "transpose", value.asInstanceOf[js.Any])
    
    inline def setTransposeFunction0(value: () => Matrix): Self = StObject.set(x, "transpose", js.Any.fromFunction0(value))
    
    inline def setTransposeToRef(value: DeepImmutable[js.Function1[/* result */ Matrix, Matrix]]): Self = StObject.set(x, "transposeToRef", value.asInstanceOf[js.Any])
    
    inline def setTransposeToRefFunction1(value: /* result */ Matrix => Matrix): Self = StObject.set(x, "transposeToRef", js.Any.fromFunction1(value))
    
    inline def setUpdateFlag(value: DeepImmutable[Double]): Self = StObject.set(x, "updateFlag", value.asInstanceOf[js.Any])
    
    inline def set_isIdentity(value: DeepImmutable[js.Any]): Self = StObject.set(x, "_isIdentity", value.asInstanceOf[js.Any])
    
    inline def set_isIdentity3x2(value: DeepImmutable[js.Any]): Self = StObject.set(x, "_isIdentity3x2", value.asInstanceOf[js.Any])
    
    inline def set_isIdentity3x2Dirty(value: DeepImmutable[js.Any]): Self = StObject.set(x, "_isIdentity3x2Dirty", value.asInstanceOf[js.Any])
    
    inline def set_isIdentityDirty(value: DeepImmutable[js.Any]): Self = StObject.set(x, "_isIdentityDirty", value.asInstanceOf[js.Any])
    
    inline def set_m(value: DeepImmutable[js.Any]): Self = StObject.set(x, "_m", value.asInstanceOf[js.Any])
    
    inline def set_markAsUpdated(value: DeepImmutable[js.Function0[Unit]]): Self = StObject.set(x, "_markAsUpdated", value.asInstanceOf[js.Any])
    
    inline def set_markAsUpdatedFunction0(value: () => Unit): Self = StObject.set(x, "_markAsUpdated", js.Any.fromFunction0(value))
    
    inline def set_updateIdentityStatus(value: DeepImmutable[js.Any]): Self = StObject.set(x, "_updateIdentityStatus", value.asInstanceOf[js.Any])
  }
}

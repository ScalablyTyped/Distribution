package typings.babylonjs.anon

import typings.babylonjs.BABYLON.DeepImmutable
import typings.babylonjs.BABYLON.Matrix
import typings.babylonjs.BABYLON.Nullable
import typings.babylonjs.BABYLON.Quaternion
import typings.babylonjs.BABYLON.Vector3
import typings.babylonjs.BABYLON.Vector4
import typings.std.Float32Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined babylonjs.BABYLON.DeepImmutableObject<babylonjs.BABYLON.Matrix> */
@js.native
trait DeepImmutableObjectMatrixAdd extends js.Object {
  
  val _isIdentity: DeepImmutable[_] = js.native
  
  val _isIdentity3x2: DeepImmutable[_] = js.native
  
  val _isIdentity3x2Dirty: DeepImmutable[_] = js.native
  
  val _isIdentityDirty: DeepImmutable[_] = js.native
  
  val _m: DeepImmutable[_] = js.native
  
  val _markAsUpdated: DeepImmutable[js.Function0[Unit]] = js.native
  
  val _updateIdentityStatus: DeepImmutable[_] = js.native
  
  val add: DeepImmutable[js.Function1[/* other */ DeepImmutable[Matrix], Matrix]] = js.native
  
  val addAtIndex: DeepImmutable[js.Function2[/* index */ Double, /* value */ Double, Matrix]] = js.native
  
  val addToRef: DeepImmutable[js.Function2[/* other */ DeepImmutable[Matrix], /* result */ Matrix, Matrix]] = js.native
  
  val addToSelf: DeepImmutable[js.Function1[/* other */ DeepImmutable[Matrix], Matrix]] = js.native
  
  val addTranslationFromFloats: DeepImmutable[js.Function3[/* x */ Double, /* y */ Double, /* z */ Double, Matrix]] = js.native
  
  val asArray: DeepImmutable[js.Function0[DeepImmutable[Float32Array | js.Array[Double]]]] = js.native
  
  @JSName("clone")
  val clone_FDeepImmutableObjectMatrixAdd: DeepImmutable[js.Function0[Matrix]] = js.native
  
  val copyFrom: DeepImmutable[js.Function1[/* other */ DeepImmutable[Matrix], Matrix]] = js.native
  
  val copyToArray: DeepImmutable[
    js.Function2[/* array */ Float32Array | js.Array[Double], /* offset */ js.UndefOr[Double], Matrix]
  ] = js.native
  
  val decompose: DeepImmutable[
    js.Function3[
      /* scale */ js.UndefOr[Vector3], 
      /* rotation */ js.UndefOr[Quaternion], 
      /* translation */ js.UndefOr[Vector3], 
      Boolean
    ]
  ] = js.native
  
  val determinant: DeepImmutable[js.Function0[Double]] = js.native
  
  @JSName("equals")
  val equals_FDeepImmutableObjectMatrixAdd: DeepImmutable[js.Function1[/* value */ DeepImmutable[Matrix], Boolean]] = js.native
  
  val getClassName: DeepImmutable[js.Function0[String]] = js.native
  
  val getHashCode: DeepImmutable[js.Function0[Double]] = js.native
  
  val getRotationMatrix: DeepImmutable[js.Function0[Matrix]] = js.native
  
  val getRotationMatrixToRef: DeepImmutable[js.Function1[/* result */ Matrix, Matrix]] = js.native
  
  val getRow: DeepImmutable[js.Function1[/* index */ Double, Nullable[Vector4]]] = js.native
  
  val getTranslation: DeepImmutable[js.Function0[Vector3]] = js.native
  
  val getTranslationToRef: DeepImmutable[js.Function1[/* result */ Vector3, Matrix]] = js.native
  
  val invert: DeepImmutable[js.Function0[Matrix]] = js.native
  
  val invertToRef: DeepImmutable[js.Function1[/* other */ Matrix, Matrix]] = js.native
  
  val isIdentity: DeepImmutable[js.Function0[Boolean]] = js.native
  
  val isIdentityAs3x2: DeepImmutable[js.Function0[Boolean]] = js.native
  
  val m: DeepImmutable[js.Function0[DeepImmutable[Float32Array | js.Array[Double]]]] = js.native
  
  val multiply: DeepImmutable[js.Function1[/* other */ DeepImmutable[Matrix], Matrix]] = js.native
  
  val multiplyAtIndex: DeepImmutable[js.Function2[/* index */ Double, /* value */ Double, Matrix]] = js.native
  
  val multiplyToArray: DeepImmutable[
    js.Function3[
      /* other */ DeepImmutable[Matrix], 
      /* result */ Float32Array | js.Array[Double], 
      /* offset */ Double, 
      Matrix
    ]
  ] = js.native
  
  val multiplyToRef: DeepImmutable[js.Function2[/* other */ DeepImmutable[Matrix], /* result */ Matrix, Matrix]] = js.native
  
  val removeRotationAndScaling: DeepImmutable[js.Function0[Matrix]] = js.native
  
  val reset: DeepImmutable[js.Function0[Matrix]] = js.native
  
  val scale: DeepImmutable[js.Function1[/* scale */ Double, Matrix]] = js.native
  
  val scaleAndAddToRef: DeepImmutable[js.Function2[/* scale */ Double, /* result */ Matrix, Matrix]] = js.native
  
  val scaleToRef: DeepImmutable[js.Function2[/* scale */ Double, /* result */ Matrix, Matrix]] = js.native
  
  val setRow: DeepImmutable[js.Function2[/* index */ Double, /* row */ Vector4, Matrix]] = js.native
  
  val setRowFromFloats: DeepImmutable[
    js.Function5[/* index */ Double, /* x */ Double, /* y */ Double, /* z */ Double, /* w */ Double, Matrix]
  ] = js.native
  
  val setTranslation: DeepImmutable[js.Function1[/* vector3 */ DeepImmutable[Vector3], Matrix]] = js.native
  
  val setTranslationFromFloats: DeepImmutable[js.Function3[/* x */ Double, /* y */ Double, /* z */ Double, Matrix]] = js.native
  
  val toArray: DeepImmutable[js.Function0[DeepImmutable[Float32Array | js.Array[Double]]]] = js.native
  
  val toNormalMatrix: DeepImmutable[js.Function1[/* ref */ Matrix, Unit]] = js.native
  
  val toggleModelMatrixHandInPlace: DeepImmutable[js.Function0[Unit]] = js.native
  
  val toggleProjectionMatrixHandInPlace: DeepImmutable[js.Function0[Unit]] = js.native
  
  val transpose: DeepImmutable[js.Function0[Matrix]] = js.native
  
  val transposeToRef: DeepImmutable[js.Function1[/* result */ Matrix, Matrix]] = js.native
  
  val updateFlag: DeepImmutable[Double] = js.native
}
object DeepImmutableObjectMatrixAdd {
  
  @scala.inline
  def apply(
    _isIdentity: DeepImmutable[_],
    _isIdentity3x2: DeepImmutable[_],
    _isIdentity3x2Dirty: DeepImmutable[_],
    _isIdentityDirty: DeepImmutable[_],
    _m: DeepImmutable[_],
    _markAsUpdated: DeepImmutable[js.Function0[Unit]],
    _updateIdentityStatus: DeepImmutable[_],
    add: DeepImmutable[js.Function1[/* other */ DeepImmutable[Matrix], Matrix]],
    addAtIndex: DeepImmutable[js.Function2[/* index */ Double, /* value */ Double, Matrix]],
    addToRef: DeepImmutable[js.Function2[/* other */ DeepImmutable[Matrix], /* result */ Matrix, Matrix]],
    addToSelf: DeepImmutable[js.Function1[/* other */ DeepImmutable[Matrix], Matrix]],
    addTranslationFromFloats: DeepImmutable[js.Function3[/* x */ Double, /* y */ Double, /* z */ Double, Matrix]],
    asArray: DeepImmutable[js.Function0[DeepImmutable[Float32Array | js.Array[Double]]]],
    clone: DeepImmutable[js.Function0[Matrix]],
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
    equals: DeepImmutable[js.Function1[/* value */ DeepImmutable[Matrix], Boolean]],
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
    val __obj = js.Dynamic.literal(_isIdentity = _isIdentity.asInstanceOf[js.Any], _isIdentity3x2 = _isIdentity3x2.asInstanceOf[js.Any], _isIdentity3x2Dirty = _isIdentity3x2Dirty.asInstanceOf[js.Any], _isIdentityDirty = _isIdentityDirty.asInstanceOf[js.Any], _m = _m.asInstanceOf[js.Any], _markAsUpdated = _markAsUpdated.asInstanceOf[js.Any], _updateIdentityStatus = _updateIdentityStatus.asInstanceOf[js.Any], add = add.asInstanceOf[js.Any], addAtIndex = addAtIndex.asInstanceOf[js.Any], addToRef = addToRef.asInstanceOf[js.Any], addToSelf = addToSelf.asInstanceOf[js.Any], addTranslationFromFloats = addTranslationFromFloats.asInstanceOf[js.Any], asArray = asArray.asInstanceOf[js.Any], clone = clone.asInstanceOf[js.Any], copyFrom = copyFrom.asInstanceOf[js.Any], copyToArray = copyToArray.asInstanceOf[js.Any], decompose = decompose.asInstanceOf[js.Any], determinant = determinant.asInstanceOf[js.Any], equals = equals.asInstanceOf[js.Any], getClassName = getClassName.asInstanceOf[js.Any], getHashCode = getHashCode.asInstanceOf[js.Any], getRotationMatrix = getRotationMatrix.asInstanceOf[js.Any], getRotationMatrixToRef = getRotationMatrixToRef.asInstanceOf[js.Any], getRow = getRow.asInstanceOf[js.Any], getTranslation = getTranslation.asInstanceOf[js.Any], getTranslationToRef = getTranslationToRef.asInstanceOf[js.Any], invert = invert.asInstanceOf[js.Any], invertToRef = invertToRef.asInstanceOf[js.Any], isIdentity = isIdentity.asInstanceOf[js.Any], isIdentityAs3x2 = isIdentityAs3x2.asInstanceOf[js.Any], m = m.asInstanceOf[js.Any], multiply = multiply.asInstanceOf[js.Any], multiplyAtIndex = multiplyAtIndex.asInstanceOf[js.Any], multiplyToArray = multiplyToArray.asInstanceOf[js.Any], multiplyToRef = multiplyToRef.asInstanceOf[js.Any], removeRotationAndScaling = removeRotationAndScaling.asInstanceOf[js.Any], reset = reset.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any], scaleAndAddToRef = scaleAndAddToRef.asInstanceOf[js.Any], scaleToRef = scaleToRef.asInstanceOf[js.Any], setRow = setRow.asInstanceOf[js.Any], setRowFromFloats = setRowFromFloats.asInstanceOf[js.Any], setTranslation = setTranslation.asInstanceOf[js.Any], setTranslationFromFloats = setTranslationFromFloats.asInstanceOf[js.Any], toArray = toArray.asInstanceOf[js.Any], toNormalMatrix = toNormalMatrix.asInstanceOf[js.Any], toggleModelMatrixHandInPlace = toggleModelMatrixHandInPlace.asInstanceOf[js.Any], toggleProjectionMatrixHandInPlace = toggleProjectionMatrixHandInPlace.asInstanceOf[js.Any], transpose = transpose.asInstanceOf[js.Any], transposeToRef = transposeToRef.asInstanceOf[js.Any], updateFlag = updateFlag.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeepImmutableObjectMatrixAdd]
  }
  
  @scala.inline
  implicit class DeepImmutableObjectMatrixAddOps[Self <: DeepImmutableObjectMatrixAdd] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def set_isIdentity(value: DeepImmutable[_]): Self = this.set("_isIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_isIdentity3x2(value: DeepImmutable[_]): Self = this.set("_isIdentity3x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_isIdentity3x2Dirty(value: DeepImmutable[_]): Self = this.set("_isIdentity3x2Dirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_isIdentityDirty(value: DeepImmutable[_]): Self = this.set("_isIdentityDirty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_m(value: DeepImmutable[_]): Self = this.set("_m", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_markAsUpdatedFunction0(value: () => Unit): Self = this.set("_markAsUpdated", js.Any.fromFunction0(value))
    
    @scala.inline
    def set_markAsUpdated(value: DeepImmutable[js.Function0[Unit]]): Self = this.set("_markAsUpdated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set_updateIdentityStatus(value: DeepImmutable[_]): Self = this.set("_updateIdentityStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddFunction1(value: /* other */ DeepImmutable[Matrix] => Matrix): Self = this.set("add", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAdd(value: DeepImmutable[js.Function1[/* other */ DeepImmutable[Matrix], Matrix]]): Self = this.set("add", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddAtIndexFunction2(value: (/* index */ Double, /* value */ Double) => Matrix): Self = this.set("addAtIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddAtIndex(value: DeepImmutable[js.Function2[/* index */ Double, /* value */ Double, Matrix]]): Self = this.set("addAtIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddToRefFunction2(value: (/* other */ DeepImmutable[Matrix], /* result */ Matrix) => Matrix): Self = this.set("addToRef", js.Any.fromFunction2(value))
    
    @scala.inline
    def setAddToRef(value: DeepImmutable[js.Function2[/* other */ DeepImmutable[Matrix], /* result */ Matrix, Matrix]]): Self = this.set("addToRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddToSelfFunction1(value: /* other */ DeepImmutable[Matrix] => Matrix): Self = this.set("addToSelf", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddToSelf(value: DeepImmutable[js.Function1[/* other */ DeepImmutable[Matrix], Matrix]]): Self = this.set("addToSelf", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddTranslationFromFloatsFunction3(value: (/* x */ Double, /* y */ Double, /* z */ Double) => Matrix): Self = this.set("addTranslationFromFloats", js.Any.fromFunction3(value))
    
    @scala.inline
    def setAddTranslationFromFloats(value: DeepImmutable[js.Function3[/* x */ Double, /* y */ Double, /* z */ Double, Matrix]]): Self = this.set("addTranslationFromFloats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAsArrayFunction0(value: () => DeepImmutable[Float32Array | js.Array[Double]]): Self = this.set("asArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setAsArray(value: DeepImmutable[js.Function0[DeepImmutable[Float32Array | js.Array[Double]]]]): Self = this.set("asArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloneFunction0(value: () => Matrix): Self = this.set("clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setClone(value: DeepImmutable[js.Function0[Matrix]]): Self = this.set("clone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyFromFunction1(value: /* other */ DeepImmutable[Matrix] => Matrix): Self = this.set("copyFrom", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCopyFrom(value: DeepImmutable[js.Function1[/* other */ DeepImmutable[Matrix], Matrix]]): Self = this.set("copyFrom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyToArrayFunction2(value: (/* array */ Float32Array | js.Array[Double], /* offset */ js.UndefOr[Double]) => Matrix): Self = this.set("copyToArray", js.Any.fromFunction2(value))
    
    @scala.inline
    def setCopyToArray(
      value: DeepImmutable[
          js.Function2[/* array */ Float32Array | js.Array[Double], /* offset */ js.UndefOr[Double], Matrix]
        ]
    ): Self = this.set("copyToArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecomposeFunction3(
      value: (/* scale */ js.UndefOr[Vector3], /* rotation */ js.UndefOr[Quaternion], /* translation */ js.UndefOr[Vector3]) => Boolean
    ): Self = this.set("decompose", js.Any.fromFunction3(value))
    
    @scala.inline
    def setDecompose(
      value: DeepImmutable[
          js.Function3[
            /* scale */ js.UndefOr[Vector3], 
            /* rotation */ js.UndefOr[Quaternion], 
            /* translation */ js.UndefOr[Vector3], 
            Boolean
          ]
        ]
    ): Self = this.set("decompose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeterminantFunction0(value: () => Double): Self = this.set("determinant", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDeterminant(value: DeepImmutable[js.Function0[Double]]): Self = this.set("determinant", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEqualsFunction1(value: /* value */ DeepImmutable[Matrix] => Boolean): Self = this.set("equals", js.Any.fromFunction1(value))
    
    @scala.inline
    def setEquals(value: DeepImmutable[js.Function1[/* value */ DeepImmutable[Matrix], Boolean]]): Self = this.set("equals", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetClassNameFunction0(value: () => String): Self = this.set("getClassName", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetClassName(value: DeepImmutable[js.Function0[String]]): Self = this.set("getClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetHashCodeFunction0(value: () => Double): Self = this.set("getHashCode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetHashCode(value: DeepImmutable[js.Function0[Double]]): Self = this.set("getHashCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetRotationMatrixFunction0(value: () => Matrix): Self = this.set("getRotationMatrix", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRotationMatrix(value: DeepImmutable[js.Function0[Matrix]]): Self = this.set("getRotationMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetRotationMatrixToRefFunction1(value: /* result */ Matrix => Matrix): Self = this.set("getRotationMatrixToRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRotationMatrixToRef(value: DeepImmutable[js.Function1[/* result */ Matrix, Matrix]]): Self = this.set("getRotationMatrixToRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetRowFunction1(value: /* index */ Double => Nullable[Vector4]): Self = this.set("getRow", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetRow(value: DeepImmutable[js.Function1[/* index */ Double, Nullable[Vector4]]]): Self = this.set("getRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetTranslationFunction0(value: () => Vector3): Self = this.set("getTranslation", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetTranslation(value: DeepImmutable[js.Function0[Vector3]]): Self = this.set("getTranslation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetTranslationToRefFunction1(value: /* result */ Vector3 => Matrix): Self = this.set("getTranslationToRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetTranslationToRef(value: DeepImmutable[js.Function1[/* result */ Vector3, Matrix]]): Self = this.set("getTranslationToRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvertFunction0(value: () => Matrix): Self = this.set("invert", js.Any.fromFunction0(value))
    
    @scala.inline
    def setInvert(value: DeepImmutable[js.Function0[Matrix]]): Self = this.set("invert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInvertToRefFunction1(value: /* other */ Matrix => Matrix): Self = this.set("invertToRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setInvertToRef(value: DeepImmutable[js.Function1[/* other */ Matrix, Matrix]]): Self = this.set("invertToRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIdentityFunction0(value: () => Boolean): Self = this.set("isIdentity", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsIdentity(value: DeepImmutable[js.Function0[Boolean]]): Self = this.set("isIdentity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsIdentityAs3x2Function0(value: () => Boolean): Self = this.set("isIdentityAs3x2", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsIdentityAs3x2(value: DeepImmutable[js.Function0[Boolean]]): Self = this.set("isIdentityAs3x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMFunction0(value: () => DeepImmutable[Float32Array | js.Array[Double]]): Self = this.set("m", js.Any.fromFunction0(value))
    
    @scala.inline
    def setM(value: DeepImmutable[js.Function0[DeepImmutable[Float32Array | js.Array[Double]]]]): Self = this.set("m", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiplyFunction1(value: /* other */ DeepImmutable[Matrix] => Matrix): Self = this.set("multiply", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMultiply(value: DeepImmutable[js.Function1[/* other */ DeepImmutable[Matrix], Matrix]]): Self = this.set("multiply", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiplyAtIndexFunction2(value: (/* index */ Double, /* value */ Double) => Matrix): Self = this.set("multiplyAtIndex", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMultiplyAtIndex(value: DeepImmutable[js.Function2[/* index */ Double, /* value */ Double, Matrix]]): Self = this.set("multiplyAtIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiplyToArrayFunction3(
      value: (/* other */ DeepImmutable[Matrix], /* result */ Float32Array | js.Array[Double], /* offset */ Double) => Matrix
    ): Self = this.set("multiplyToArray", js.Any.fromFunction3(value))
    
    @scala.inline
    def setMultiplyToArray(
      value: DeepImmutable[
          js.Function3[
            /* other */ DeepImmutable[Matrix], 
            /* result */ Float32Array | js.Array[Double], 
            /* offset */ Double, 
            Matrix
          ]
        ]
    ): Self = this.set("multiplyToArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMultiplyToRefFunction2(value: (/* other */ DeepImmutable[Matrix], /* result */ Matrix) => Matrix): Self = this.set("multiplyToRef", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMultiplyToRef(value: DeepImmutable[js.Function2[/* other */ DeepImmutable[Matrix], /* result */ Matrix, Matrix]]): Self = this.set("multiplyToRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemoveRotationAndScalingFunction0(value: () => Matrix): Self = this.set("removeRotationAndScaling", js.Any.fromFunction0(value))
    
    @scala.inline
    def setRemoveRotationAndScaling(value: DeepImmutable[js.Function0[Matrix]]): Self = this.set("removeRotationAndScaling", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResetFunction0(value: () => Matrix): Self = this.set("reset", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReset(value: DeepImmutable[js.Function0[Matrix]]): Self = this.set("reset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleFunction1(value: /* scale */ Double => Matrix): Self = this.set("scale", js.Any.fromFunction1(value))
    
    @scala.inline
    def setScale(value: DeepImmutable[js.Function1[/* scale */ Double, Matrix]]): Self = this.set("scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleAndAddToRefFunction2(value: (/* scale */ Double, /* result */ Matrix) => Matrix): Self = this.set("scaleAndAddToRef", js.Any.fromFunction2(value))
    
    @scala.inline
    def setScaleAndAddToRef(value: DeepImmutable[js.Function2[/* scale */ Double, /* result */ Matrix, Matrix]]): Self = this.set("scaleAndAddToRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScaleToRefFunction2(value: (/* scale */ Double, /* result */ Matrix) => Matrix): Self = this.set("scaleToRef", js.Any.fromFunction2(value))
    
    @scala.inline
    def setScaleToRef(value: DeepImmutable[js.Function2[/* scale */ Double, /* result */ Matrix, Matrix]]): Self = this.set("scaleToRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetRowFunction2(value: (/* index */ Double, /* row */ Vector4) => Matrix): Self = this.set("setRow", js.Any.fromFunction2(value))
    
    @scala.inline
    def setSetRow(value: DeepImmutable[js.Function2[/* index */ Double, /* row */ Vector4, Matrix]]): Self = this.set("setRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetRowFromFloatsFunction5(
      value: (/* index */ Double, /* x */ Double, /* y */ Double, /* z */ Double, /* w */ Double) => Matrix
    ): Self = this.set("setRowFromFloats", js.Any.fromFunction5(value))
    
    @scala.inline
    def setSetRowFromFloats(
      value: DeepImmutable[
          js.Function5[/* index */ Double, /* x */ Double, /* y */ Double, /* z */ Double, /* w */ Double, Matrix]
        ]
    ): Self = this.set("setRowFromFloats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetTranslationFunction1(value: /* vector3 */ DeepImmutable[Vector3] => Matrix): Self = this.set("setTranslation", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSetTranslation(value: DeepImmutable[js.Function1[/* vector3 */ DeepImmutable[Vector3], Matrix]]): Self = this.set("setTranslation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetTranslationFromFloatsFunction3(value: (/* x */ Double, /* y */ Double, /* z */ Double) => Matrix): Self = this.set("setTranslationFromFloats", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetTranslationFromFloats(value: DeepImmutable[js.Function3[/* x */ Double, /* y */ Double, /* z */ Double, Matrix]]): Self = this.set("setTranslationFromFloats", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToArrayFunction0(value: () => DeepImmutable[Float32Array | js.Array[Double]]): Self = this.set("toArray", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToArray(value: DeepImmutable[js.Function0[DeepImmutable[Float32Array | js.Array[Double]]]]): Self = this.set("toArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToNormalMatrixFunction1(value: /* ref */ Matrix => Unit): Self = this.set("toNormalMatrix", js.Any.fromFunction1(value))
    
    @scala.inline
    def setToNormalMatrix(value: DeepImmutable[js.Function1[/* ref */ Matrix, Unit]]): Self = this.set("toNormalMatrix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleModelMatrixHandInPlaceFunction0(value: () => Unit): Self = this.set("toggleModelMatrixHandInPlace", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggleModelMatrixHandInPlace(value: DeepImmutable[js.Function0[Unit]]): Self = this.set("toggleModelMatrixHandInPlace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleProjectionMatrixHandInPlaceFunction0(value: () => Unit): Self = this.set("toggleProjectionMatrixHandInPlace", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToggleProjectionMatrixHandInPlace(value: DeepImmutable[js.Function0[Unit]]): Self = this.set("toggleProjectionMatrixHandInPlace", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransposeFunction0(value: () => Matrix): Self = this.set("transpose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setTranspose(value: DeepImmutable[js.Function0[Matrix]]): Self = this.set("transpose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransposeToRefFunction1(value: /* result */ Matrix => Matrix): Self = this.set("transposeToRef", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTransposeToRef(value: DeepImmutable[js.Function1[/* result */ Matrix, Matrix]]): Self = this.set("transposeToRef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateFlag(value: DeepImmutable[Double]): Self = this.set("updateFlag", value.asInstanceOf[js.Any])
  }
}

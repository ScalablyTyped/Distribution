package typings.cwiseCompiler

import typings.cwiseParser.mod.CompiledRoutine
import typings.ndarray.mod.ndarray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(user_args: UserArgs): js.Function3[
    /* a */ ndarray[Double], 
    /* b */ ndarray[Double], 
    /* repeated */ ndarray[Double], 
    ndarray[Double]
  ] = ^.asInstanceOf[js.Dynamic].apply(user_args.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
    /* a */ ndarray[Double], 
    /* b */ ndarray[Double], 
    /* repeated */ ndarray[Double], 
    ndarray[Double]
  ]]
  
  @JSImport("cwise-compiler", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.cwiseCompiler.cwiseCompilerStrings.array
    - typings.cwiseCompiler.cwiseCompilerStrings.offset
    - typings.cwiseCompiler.cwiseCompilerStrings.shape
    - typings.cwiseCompiler.cwiseCompilerStrings.scalar
    - typings.cwiseCompiler.cwiseCompilerStrings.index
    - typings.cwiseCompiler.mod.BlockIndice
    - typings.cwiseCompiler.mod.OffsetArg
  */
  trait ArgType extends StObject
  
  trait BlockIndice
    extends StObject
       with ArgType {
    
    var blockIndices: Double
  }
  object BlockIndice {
    
    inline def apply(blockIndices: Double): BlockIndice = {
      val __obj = js.Dynamic.literal(blockIndices = blockIndices.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockIndice]
    }
    
    extension [Self <: BlockIndice](x: Self) {
      
      inline def setBlockIndices(value: Double): Self = StObject.set(x, "blockIndices", value.asInstanceOf[js.Any])
    }
  }
  
  trait OffsetArg
    extends StObject
       with ArgType {
    
    var array: Double
    
    var offset: js.Array[Double]
  }
  object OffsetArg {
    
    inline def apply(array: Double, offset: js.Array[Double]): OffsetArg = {
      val __obj = js.Dynamic.literal(array = array.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
      __obj.asInstanceOf[OffsetArg]
    }
    
    extension [Self <: OffsetArg](x: Self) {
      
      inline def setArray(value: Double): Self = StObject.set(x, "array", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: js.Array[Double]): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setOffsetVarargs(value: Double*): Self = StObject.set(x, "offset", js.Array(value :_*))
    }
  }
  
  trait Procedure extends StObject {
    
    var argTypes: js.Array[ArgType]
    
    var arrayArgs: js.Array[Double]
    
    var arrayBlockIndices: js.Array[Double]
    
    var blockSize: js.UndefOr[Double] = js.undefined
    
    var body: CompiledRoutine
    
    var debug: Boolean
    
    var funcName: String
    
    var indexArgs: js.Array[Double]
    
    var offsetArgIndex: js.Array[Double]
    
    var offsetArgs: js.Array[OffsetArg]
    
    var post: CompiledRoutine
    
    var pre: CompiledRoutine
    
    var scalarArgs: js.Array[Double]
    
    var shapeArgs: js.Array[Double]
    
    var shimArgs: js.Array[String]
  }
  object Procedure {
    
    inline def apply(
      argTypes: js.Array[ArgType],
      arrayArgs: js.Array[Double],
      arrayBlockIndices: js.Array[Double],
      body: CompiledRoutine,
      debug: Boolean,
      funcName: String,
      indexArgs: js.Array[Double],
      offsetArgIndex: js.Array[Double],
      offsetArgs: js.Array[OffsetArg],
      post: CompiledRoutine,
      pre: CompiledRoutine,
      scalarArgs: js.Array[Double],
      shapeArgs: js.Array[Double],
      shimArgs: js.Array[String]
    ): Procedure = {
      val __obj = js.Dynamic.literal(argTypes = argTypes.asInstanceOf[js.Any], arrayArgs = arrayArgs.asInstanceOf[js.Any], arrayBlockIndices = arrayBlockIndices.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], funcName = funcName.asInstanceOf[js.Any], indexArgs = indexArgs.asInstanceOf[js.Any], offsetArgIndex = offsetArgIndex.asInstanceOf[js.Any], offsetArgs = offsetArgs.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any], scalarArgs = scalarArgs.asInstanceOf[js.Any], shapeArgs = shapeArgs.asInstanceOf[js.Any], shimArgs = shimArgs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Procedure]
    }
    
    extension [Self <: Procedure](x: Self) {
      
      inline def setArgTypes(value: js.Array[ArgType]): Self = StObject.set(x, "argTypes", value.asInstanceOf[js.Any])
      
      inline def setArgTypesVarargs(value: ArgType*): Self = StObject.set(x, "argTypes", js.Array(value :_*))
      
      inline def setArrayArgs(value: js.Array[Double]): Self = StObject.set(x, "arrayArgs", value.asInstanceOf[js.Any])
      
      inline def setArrayArgsVarargs(value: Double*): Self = StObject.set(x, "arrayArgs", js.Array(value :_*))
      
      inline def setArrayBlockIndices(value: js.Array[Double]): Self = StObject.set(x, "arrayBlockIndices", value.asInstanceOf[js.Any])
      
      inline def setArrayBlockIndicesVarargs(value: Double*): Self = StObject.set(x, "arrayBlockIndices", js.Array(value :_*))
      
      inline def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
      
      inline def setBlockSizeUndefined: Self = StObject.set(x, "blockSize", js.undefined)
      
      inline def setBody(value: CompiledRoutine): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setFuncName(value: String): Self = StObject.set(x, "funcName", value.asInstanceOf[js.Any])
      
      inline def setIndexArgs(value: js.Array[Double]): Self = StObject.set(x, "indexArgs", value.asInstanceOf[js.Any])
      
      inline def setIndexArgsVarargs(value: Double*): Self = StObject.set(x, "indexArgs", js.Array(value :_*))
      
      inline def setOffsetArgIndex(value: js.Array[Double]): Self = StObject.set(x, "offsetArgIndex", value.asInstanceOf[js.Any])
      
      inline def setOffsetArgIndexVarargs(value: Double*): Self = StObject.set(x, "offsetArgIndex", js.Array(value :_*))
      
      inline def setOffsetArgs(value: js.Array[OffsetArg]): Self = StObject.set(x, "offsetArgs", value.asInstanceOf[js.Any])
      
      inline def setOffsetArgsVarargs(value: OffsetArg*): Self = StObject.set(x, "offsetArgs", js.Array(value :_*))
      
      inline def setPost(value: CompiledRoutine): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
      
      inline def setPre(value: CompiledRoutine): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
      
      inline def setScalarArgs(value: js.Array[Double]): Self = StObject.set(x, "scalarArgs", value.asInstanceOf[js.Any])
      
      inline def setScalarArgsVarargs(value: Double*): Self = StObject.set(x, "scalarArgs", js.Array(value :_*))
      
      inline def setShapeArgs(value: js.Array[Double]): Self = StObject.set(x, "shapeArgs", value.asInstanceOf[js.Any])
      
      inline def setShapeArgsVarargs(value: Double*): Self = StObject.set(x, "shapeArgs", js.Array(value :_*))
      
      inline def setShimArgs(value: js.Array[String]): Self = StObject.set(x, "shimArgs", value.asInstanceOf[js.Any])
      
      inline def setShimArgsVarargs(value: String*): Self = StObject.set(x, "shimArgs", js.Array(value :_*))
    }
  }
  
  trait UserArgs extends StObject {
    
    var args: js.Array[ArgType]
    
    var blockSize: Double
    
    var body: CompiledRoutine
    
    var debug: Boolean
    
    var funcName: String
    
    var post: CompiledRoutine
    
    var pre: CompiledRoutine
    
    var printCode: js.UndefOr[Boolean] = js.undefined
  }
  object UserArgs {
    
    inline def apply(
      args: js.Array[ArgType],
      blockSize: Double,
      body: CompiledRoutine,
      debug: Boolean,
      funcName: String,
      post: CompiledRoutine,
      pre: CompiledRoutine
    ): UserArgs = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], blockSize = blockSize.asInstanceOf[js.Any], body = body.asInstanceOf[js.Any], debug = debug.asInstanceOf[js.Any], funcName = funcName.asInstanceOf[js.Any], post = post.asInstanceOf[js.Any], pre = pre.asInstanceOf[js.Any])
      __obj.asInstanceOf[UserArgs]
    }
    
    extension [Self <: UserArgs](x: Self) {
      
      inline def setArgs(value: js.Array[ArgType]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: ArgType*): Self = StObject.set(x, "args", js.Array(value :_*))
      
      inline def setBlockSize(value: Double): Self = StObject.set(x, "blockSize", value.asInstanceOf[js.Any])
      
      inline def setBody(value: CompiledRoutine): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setFuncName(value: String): Self = StObject.set(x, "funcName", value.asInstanceOf[js.Any])
      
      inline def setPost(value: CompiledRoutine): Self = StObject.set(x, "post", value.asInstanceOf[js.Any])
      
      inline def setPre(value: CompiledRoutine): Self = StObject.set(x, "pre", value.asInstanceOf[js.Any])
      
      inline def setPrintCode(value: Boolean): Self = StObject.set(x, "printCode", value.asInstanceOf[js.Any])
      
      inline def setPrintCodeUndefined: Self = StObject.set(x, "printCode", js.undefined)
    }
  }
}

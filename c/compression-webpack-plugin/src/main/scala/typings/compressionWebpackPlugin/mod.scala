package typings.compressionWebpackPlugin

import org.scalablytyped.runtime.StringDictionary
import typings.compressionWebpackPlugin.anon.ToPrimitive
import typings.compressionWebpackPlugin.anon.ValueOf
import typings.compressionWebpackPlugin.anon.`0`
import typings.compressionWebpackPlugin.anon.`1`
import typings.compressionWebpackPlugin.anon.`2`
import typings.compressionWebpackPlugin.compressionWebpackPluginStrings.`keep-source-map`
import typings.node.bufferMod.global.Buffer
import typings.std.SharedArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /** @typedef {import("schema-utils/declarations/validate").Schema} Schema */
  /** @typedef {import("webpack").Compiler} Compiler */
  /** @typedef {import("webpack").WebpackPluginInstance} WebpackPluginInstance */
  /** @typedef {import("webpack").Compilation} Compilation */
  /** @typedef {import("webpack").sources.Source} Source */
  /** @typedef {import("webpack").Asset} Asset */
  /** @typedef {import("webpack").WebpackError} WebpackError */
  /**
    * @template T
    * @typedef {T | { valueOf(): T }} WithImplicitCoercion
    */
  /** @typedef {RegExp | string} Rule */
  /** @typedef {Rule[] | Rule} Rules */
  /**
    * @typedef {{ [key: string]: any }} CustomOptions
    */
  /**
    * @template T
    * @typedef {T extends infer U ? U : CustomOptions} InferDefaultType
    */
  /**
    * @template T
    * @typedef {InferDefaultType<T>} CompressionOptions
    */
  /**
    * @template T
    * @callback AlgorithmFunction
    * @param {Buffer} input
    * @param {CompressionOptions<T>} options
    * @param {(error: Error | null | undefined, result: WithImplicitCoercion<ArrayBuffer | SharedArrayBuffer> | Uint8Array | ReadonlyArray<number> | WithImplicitCoercion<Uint8Array | ReadonlyArray<number> | string> | WithImplicitCoercion<string> | { [Symbol.toPrimitive](hint: 'string'): string }) => void} callback
    */
  /**
    * @typedef {{[key: string]: any}} PathData
    */
  /**
    * @typedef {string | ((fileData: PathData) => string)} Filename
    */
  /**
    * @typedef {boolean | "keep-source-map"} DeleteOriginalAssets
    */
  /**
    * @template T
    * @typedef {Object} BasePluginOptions
    * @property {Rules} [test]
    * @property {Rules} [include]
    * @property {Rules} [exclude]
    * @property {number} [threshold]
    * @property {number} [minRatio]
    * @property {DeleteOriginalAssets} [deleteOriginalAssets]
    * @property {Filename} [filename]
    */
  /**
    * @typedef {import("zlib").ZlibOptions} ZlibOptions
    */
  /**
    * @template T
    * @typedef {T extends ZlibOptions ? { algorithm?: string | AlgorithmFunction<T> | undefined, compressionOptions?: CompressionOptions<T> | undefined } : { algorithm: string | AlgorithmFunction<T>, compressionOptions?: CompressionOptions<T> | undefined }} DefinedDefaultAlgorithmAndOptions
    */
  /**
    * @template T
    * @typedef {BasePluginOptions<T> & { algorithm: string | AlgorithmFunction<T>, compressionOptions: CompressionOptions<T>, threshold: number, minRatio: number, deleteOriginalAssets: DeleteOriginalAssets, filename: Filename }} InternalPluginOptions
    */
  /**
    * @template [T=ZlibOptions]
    * @implements WebpackPluginInstance
    */
  @JSImport("compression-webpack-plugin", JSImport.Namespace)
  @js.native
  /**
    * @param {BasePluginOptions<T> & DefinedDefaultAlgorithmAndOptions<T>} [options]
    */
  open class ^[T] ()
    extends StObject
       with CompressionPlugin[T] {
    def this(options: BasePluginOptions[T] & DefinedDefaultAlgorithmAndOptions[T]) = this()
    
    /**
      * @private
      * @type {AlgorithmFunction<T>}
      */
    /* private */ /* CompleteClass */
    var algorithm: Any = js.native
    
    /**
    	 * The run point of the plugin, required method.
    	 */
    /* CompleteClass */
    @JSName("apply")
    override def apply(compiler: typings.webpack.mod.Compiler): Unit = js.native
    
    /**
      * @private
      * @param {Compiler} compiler
      * @param {Compilation} compilation
      * @param {Record<string, Source>} assets
      * @returns {Promise<void>}
      */
    /* private */ /* CompleteClass */
    var compress: Any = js.native
    
    /**
      * @private
      * @type {InternalPluginOptions<T>}
      */
    /* private */ /* CompleteClass */
    var options: Any = js.native
    
    /**
      * @private
      * @param {Buffer} input
      * @returns {Promise<Buffer>}
      */
    /* private */ /* CompleteClass */
    var runCompressionAlgorithm: Any = js.native
  }
  
  type AlgorithmFunction[T] = js.Function3[
    /* input */ Buffer, 
    /* options */ CompressionOptions[T], 
    /* callback */ js.Function2[
      /* error */ js.UndefOr[js.Error | Null], 
      /* result */ String | js.typedarray.ArrayBuffer | SharedArrayBuffer | js.typedarray.Uint8Array | js.Array[Double] | `0` | `1` | `2` | ToPrimitive, 
      Unit
    ], 
    Any
  ]
  
  type Asset = typings.webpack.mod.Asset
  
  trait BasePluginOptions[T] extends StObject {
    
    var deleteOriginalAssets: js.UndefOr[DeleteOriginalAssets] = js.undefined
    
    var exclude: js.UndefOr[Rules] = js.undefined
    
    var filename: js.UndefOr[Filename] = js.undefined
    
    var include: js.UndefOr[Rules] = js.undefined
    
    var minRatio: js.UndefOr[Double] = js.undefined
    
    var test: js.UndefOr[Rules] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
  }
  object BasePluginOptions {
    
    inline def apply[T](): BasePluginOptions[T] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasePluginOptions[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BasePluginOptions[?], T] (val x: Self & BasePluginOptions[T]) extends AnyVal {
      
      inline def setDeleteOriginalAssets(value: DeleteOriginalAssets): Self = StObject.set(x, "deleteOriginalAssets", value.asInstanceOf[js.Any])
      
      inline def setDeleteOriginalAssetsUndefined: Self = StObject.set(x, "deleteOriginalAssets", js.undefined)
      
      inline def setExclude(value: Rules): Self = StObject.set(x, "exclude", value.asInstanceOf[js.Any])
      
      inline def setExcludeUndefined: Self = StObject.set(x, "exclude", js.undefined)
      
      inline def setExcludeVarargs(value: Rule*): Self = StObject.set(x, "exclude", js.Array(value*))
      
      inline def setFilename(value: Filename): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameFunction1(value: /* fileData */ PathData => String): Self = StObject.set(x, "filename", js.Any.fromFunction1(value))
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
      
      inline def setInclude(value: Rules): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setIncludeVarargs(value: Rule*): Self = StObject.set(x, "include", js.Array(value*))
      
      inline def setMinRatio(value: Double): Self = StObject.set(x, "minRatio", value.asInstanceOf[js.Any])
      
      inline def setMinRatioUndefined: Self = StObject.set(x, "minRatio", js.undefined)
      
      inline def setTest(value: Rules): Self = StObject.set(x, "test", value.asInstanceOf[js.Any])
      
      inline def setTestUndefined: Self = StObject.set(x, "test", js.undefined)
      
      inline def setTestVarargs(value: Rule*): Self = StObject.set(x, "test", js.Array(value*))
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
  
  type Compilation = typings.webpack.mod.Compilation
  
  type Compiler = typings.webpack.mod.Compiler
  
  type CompressionOptions[T] = InferDefaultType[T]
  
  /** @typedef {import("schema-utils/declarations/validate").Schema} Schema */
  /** @typedef {import("webpack").Compiler} Compiler */
  /** @typedef {import("webpack").WebpackPluginInstance} WebpackPluginInstance */
  /** @typedef {import("webpack").Compilation} Compilation */
  /** @typedef {import("webpack").sources.Source} Source */
  /** @typedef {import("webpack").Asset} Asset */
  /** @typedef {import("webpack").WebpackError} WebpackError */
  /**
    * @template T
    * @typedef {T | { valueOf(): T }} WithImplicitCoercion
    */
  /** @typedef {RegExp | string} Rule */
  /** @typedef {Rule[] | Rule} Rules */
  /**
    * @typedef {{ [key: string]: any }} CustomOptions
    */
  /**
    * @template T
    * @typedef {T extends infer U ? U : CustomOptions} InferDefaultType
    */
  /**
    * @template T
    * @typedef {InferDefaultType<T>} CompressionOptions
    */
  /**
    * @template T
    * @callback AlgorithmFunction
    * @param {Buffer} input
    * @param {CompressionOptions<T>} options
    * @param {(error: Error | null | undefined, result: WithImplicitCoercion<ArrayBuffer | SharedArrayBuffer> | Uint8Array | ReadonlyArray<number> | WithImplicitCoercion<Uint8Array | ReadonlyArray<number> | string> | WithImplicitCoercion<string> | { [Symbol.toPrimitive](hint: 'string'): string }) => void} callback
    */
  /**
    * @typedef {{[key: string]: any}} PathData
    */
  /**
    * @typedef {string | ((fileData: PathData) => string)} Filename
    */
  /**
    * @typedef {boolean | "keep-source-map"} DeleteOriginalAssets
    */
  /**
    * @template T
    * @typedef {Object} BasePluginOptions
    * @property {Rules} [test]
    * @property {Rules} [include]
    * @property {Rules} [exclude]
    * @property {number} [threshold]
    * @property {number} [minRatio]
    * @property {DeleteOriginalAssets} [deleteOriginalAssets]
    * @property {Filename} [filename]
    */
  /**
    * @typedef {import("zlib").ZlibOptions} ZlibOptions
    */
  /**
    * @template T
    * @typedef {T extends ZlibOptions ? { algorithm?: string | AlgorithmFunction<T> | undefined, compressionOptions?: CompressionOptions<T> | undefined } : { algorithm: string | AlgorithmFunction<T>, compressionOptions?: CompressionOptions<T> | undefined }} DefinedDefaultAlgorithmAndOptions
    */
  /**
    * @template T
    * @typedef {BasePluginOptions<T> & { algorithm: string | AlgorithmFunction<T>, compressionOptions: CompressionOptions<T>, threshold: number, minRatio: number, deleteOriginalAssets: DeleteOriginalAssets, filename: Filename }} InternalPluginOptions
    */
  /**
    * @template [T=ZlibOptions]
    * @implements WebpackPluginInstance
    */
  trait CompressionPlugin[T]
    extends StObject
       with typings.webpack.mod.WebpackPluginInstance {
    
    /**
      * @private
      * @type {AlgorithmFunction<T>}
      */
    /* private */ var algorithm: Any
    
    /**
      * @private
      * @param {Compiler} compiler
      * @param {Compilation} compilation
      * @param {Record<string, Source>} assets
      * @returns {Promise<void>}
      */
    /* private */ var compress: Any
    
    /**
      * @private
      * @type {InternalPluginOptions<T>}
      */
    /* private */ var options: Any
    
    /**
      * @private
      * @param {Buffer} input
      * @returns {Promise<Buffer>}
      */
    /* private */ var runCompressionAlgorithm: Any
  }
  object CompressionPlugin {
    
    inline def apply[T](
      algorithm: Any,
      apply: typings.webpack.mod.Compiler => Unit,
      compress: Any,
      options: Any,
      runCompressionAlgorithm: Any
    ): CompressionPlugin[T] = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], apply = js.Any.fromFunction1(apply), compress = compress.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], runCompressionAlgorithm = runCompressionAlgorithm.asInstanceOf[js.Any])
      __obj.asInstanceOf[CompressionPlugin[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CompressionPlugin[?], T] (val x: Self & CompressionPlugin[T]) extends AnyVal {
      
      inline def setAlgorithm(value: Any): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setCompress(value: Any): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setRunCompressionAlgorithm(value: Any): Self = StObject.set(x, "runCompressionAlgorithm", value.asInstanceOf[js.Any])
    }
  }
  
  type CustomOptions = StringDictionary[Any]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends compression-webpack-plugin.compression-webpack-plugin.ZlibOptions ? {  algorithm :string | compression-webpack-plugin.compression-webpack-plugin.AlgorithmFunction<T> | undefined,   compressionOptions :compression-webpack-plugin.compression-webpack-plugin.CompressionOptions<T> | undefined} : {  algorithm :string | compression-webpack-plugin.compression-webpack-plugin.AlgorithmFunction<T>,   compressionOptions :compression-webpack-plugin.compression-webpack-plugin.CompressionOptions<T> | undefined}
    }}}
    */
  @js.native
  trait DefinedDefaultAlgorithmAndOptions[T] extends StObject
  
  type DeleteOriginalAssets = Boolean | `keep-source-map`
  
  type Filename = String | (js.Function1[/* fileData */ PathData, String])
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends infer U ? U : compression-webpack-plugin.compression-webpack-plugin.CustomOptions
    }}}
    */
  type InferDefaultType[T] = CustomOptions
  
  trait InternalPluginOptions[T]
    extends StObject
       with BasePluginOptions[T] {
    
    var algorithm: String | AlgorithmFunction[T]
    
    var compressionOptions: CompressionOptions[T]
    
    @JSName("deleteOriginalAssets")
    var deleteOriginalAssets_InternalPluginOptions: DeleteOriginalAssets
    
    @JSName("filename")
    var filename_InternalPluginOptions: Filename
    
    @JSName("minRatio")
    var minRatio_InternalPluginOptions: Double
    
    @JSName("threshold")
    var threshold_InternalPluginOptions: Double
  }
  object InternalPluginOptions {
    
    inline def apply[T](
      algorithm: String | AlgorithmFunction[T],
      compressionOptions: CompressionOptions[T],
      deleteOriginalAssets: DeleteOriginalAssets,
      filename: Filename,
      minRatio: Double,
      threshold: Double
    ): InternalPluginOptions[T] = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], compressionOptions = compressionOptions.asInstanceOf[js.Any], deleteOriginalAssets = deleteOriginalAssets.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], minRatio = minRatio.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
      __obj.asInstanceOf[InternalPluginOptions[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InternalPluginOptions[?], T] (val x: Self & InternalPluginOptions[T]) extends AnyVal {
      
      inline def setAlgorithm(value: String | AlgorithmFunction[T]): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmFunction3(
        value: (/* input */ Buffer, /* options */ CompressionOptions[T], /* callback */ js.Function2[
              /* error */ js.UndefOr[js.Error | Null], 
              /* result */ String | js.typedarray.ArrayBuffer | SharedArrayBuffer | js.typedarray.Uint8Array | js.Array[Double] | `0` | `1` | `2` | ToPrimitive, 
              Unit
            ]) => Any
      ): Self = StObject.set(x, "algorithm", js.Any.fromFunction3(value))
      
      inline def setCompressionOptions(value: CompressionOptions[T]): Self = StObject.set(x, "compressionOptions", value.asInstanceOf[js.Any])
      
      inline def setDeleteOriginalAssets(value: DeleteOriginalAssets): Self = StObject.set(x, "deleteOriginalAssets", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: Filename): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setFilenameFunction1(value: /* fileData */ PathData => String): Self = StObject.set(x, "filename", js.Any.fromFunction1(value))
      
      inline def setMinRatio(value: Double): Self = StObject.set(x, "minRatio", value.asInstanceOf[js.Any])
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
    }
  }
  
  type PathData = StringDictionary[Any]
  
  type Rule = js.RegExp | String
  
  type Rules = js.Array[Rule] | Rule
  
  type Schema = typings.schemaUtils.declarationsValidateMod.Schema
  
  type Source = typings.webpack.mod.Source
  
  type WebpackError = typings.webpack.mod.WebpackError
  
  type WebpackPluginInstance = typings.webpack.mod.WebpackPluginInstance
  
  type WithImplicitCoercion[T] = T | ValueOf[T]
  
  type ZlibOptions = typings.node.zlibMod.ZlibOptions
}

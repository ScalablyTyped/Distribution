package typings.bagpipes

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("bagpipes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("bagpipes", "Bagpipes")
  @js.native
  open class Bagpipes () extends StObject {
    
    /** The `Bagpipes`' configuration */
    var config: Config = js.native
    
    /**
      * Creates a `Fitting`
      * @throws {Error} Throws error if an invalid (not defined) fitting typ is used
      *                 (can't find argument `fittingType` in `Bagpipes.fittingTypes`)
      */
    def createFitting(fittingDef: FittingDef): Fitting = js.native
    
    /** returns `pipeworks` Pipe instance */
    def createPipe(pipeDef: PipeDef): Pipe = js.native
    
    def createPipeFromFitting(fitting: Fitting, fittingDef: FittingDef): Pipe = js.native
    
    /**
      * Hashmap of `fittingType`s (the name of a fitting) and the
      * `FittingFactory` functions used to create them
      */
    var fittingTypes: FittingTypesMap = js.native
    
    /**
      * Finds and returns a `Pipe` by name and lazily creates if it is not defined
      * @throws {Error} Throws error if `pipeDef` pipe is not yet defined and `pipeDef` is
      *                 not supplied
      */
    def getPipe(pipeName: String): Pipe = js.native
    def getPipe(pipeName: String, pipeDef: PipeDef): Pipe = js.native
    
    /** Handler for errors that occure when a `Fitting` gets 'played' */
    def handleError(context: FittingContext, err: js.Error): Unit = js.native
    
    /** Loads `FittingFactory`s from file-system and adds them to `Bagpipes.fittingTypes` */
    def loadFittingTypes(): FittingTypesMap = js.native
    
    /**
      * Builds a new (wrappend) `Fitting`
      * @throws {Error} Throws error if an invalid (not defined) fitting typ is used
      *                 (can't find argument `fittingType` in `Bagpipes.fittingTypes`)
      */
    def newFitting(fittingType: String, fittingDef: FittingDef): Fitting = js.native
    
    /** The pipes */
    var pipes: StringDictionary[Pipe] = js.native
    
    /** Run the pipeline */
    def play(pipe: Pipe, context: Any): Unit = js.native
    
    /**
      * Wraps `Fitting` with debugging, `preflight`, `postflight`
      * and error handling functionality and returns as new Fitting
      */
    def wrapFitting(fitting: Fitting, fittingDef: FittingDef): Fitting | Null = js.native
  }
  
  @JSImport("bagpipes", "Pipe")
  @js.native
  open class Pipe () extends StObject {
    
    /** add a new `Fitting` (piece) to the pipe (aka. pipeline) */
    def fit(options: PipeworksOptions, pipe: Fitting): Pipe = js.native
    /** add a new `Fitting` (piece) to the pipe (aka. pipeline) */
    def fit(pipe: Fitting): Pipe = js.native
    
    /**
      * Send something down the pipe (aka. pipeline)! Any number of arguments
      * can be sent, but often there's just a single `context` object.
      */
    def flow(args: Any*): Pipe = js.native
    
    /** Redirect the flow to another pipe (aka. pipeline). */
    def siphon(options: PipeworksOptions, pipe: Fitting): Pipe = js.native
    /** Redirect the flow to another pipe (aka. pipeline). */
    def siphon(pipe: Fitting): Pipe = js.native
  }
  
  inline def create(pipesDefs: PipeDefMap): Bagpipes = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(pipesDefs.asInstanceOf[js.Any]).asInstanceOf[Bagpipes]
  inline def create(pipesDefs: PipeDefMap, conf: Config): Bagpipes = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(pipesDefs.asInstanceOf[js.Any], conf.asInstanceOf[js.Any])).asInstanceOf[Bagpipes]
  
  /* Rewritten from type alias, can be one of: 
    - typings.bagpipes.bagpipesStrings.hoist
    - typings.bagpipes.bagpipesStrings.sink
  */
  trait Affinity extends StObject
  object Affinity {
    
    inline def hoist: typings.bagpipes.bagpipesStrings.hoist = "hoist".asInstanceOf[typings.bagpipes.bagpipesStrings.hoist]
    
    inline def sink: typings.bagpipes.bagpipesStrings.sink = "sink".asInstanceOf[typings.bagpipes.bagpipesStrings.sink]
  }
  
  trait Config
    extends StObject
       with /* prop */ StringDictionary[Any] {
    
    var connectMiddlewareDirs: js.UndefOr[js.Array[String]] = js.undefined
    
    var userFittingsDirs: js.UndefOr[js.Array[String]] = js.undefined
    
    var userViewsDirs: js.UndefOr[js.Array[String]] = js.undefined
  }
  object Config {
    
    inline def apply(): Config = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config]
    }
    
    extension [Self <: Config](x: Self) {
      
      inline def setConnectMiddlewareDirs(value: js.Array[String]): Self = StObject.set(x, "connectMiddlewareDirs", value.asInstanceOf[js.Any])
      
      inline def setConnectMiddlewareDirsUndefined: Self = StObject.set(x, "connectMiddlewareDirs", js.undefined)
      
      inline def setConnectMiddlewareDirsVarargs(value: String*): Self = StObject.set(x, "connectMiddlewareDirs", js.Array(value*))
      
      inline def setUserFittingsDirs(value: js.Array[String]): Self = StObject.set(x, "userFittingsDirs", value.asInstanceOf[js.Any])
      
      inline def setUserFittingsDirsUndefined: Self = StObject.set(x, "userFittingsDirs", js.undefined)
      
      inline def setUserFittingsDirsVarargs(value: String*): Self = StObject.set(x, "userFittingsDirs", js.Array(value*))
      
      inline def setUserViewsDirs(value: js.Array[String]): Self = StObject.set(x, "userViewsDirs", value.asInstanceOf[js.Any])
      
      inline def setUserViewsDirsUndefined: Self = StObject.set(x, "userViewsDirs", js.undefined)
      
      inline def setUserViewsDirsVarargs(value: String*): Self = StObject.set(x, "userViewsDirs", js.Array(value*))
    }
  }
  
  type Fitting = js.Function2[
    /* context */ FittingContext, 
    /* next */ js.Function2[/* err */ js.UndefOr[js.Error | Null], /* res */ js.UndefOr[Any], Unit], 
    Unit
  ]
  
  trait FittingContext
    extends StObject
       with /* prop */ StringDictionary[Any] {
    
    /**
      * The input defined in the fitting definition
      * (string, number, object, array)
      */
    var input: Any
    
    /** Output to be delivered to the next fitting or client */
    var output: Any
  }
  object FittingContext {
    
    inline def apply(input: Any, output: Any): FittingContext = {
      val __obj = js.Dynamic.literal(input = input.asInstanceOf[js.Any], output = output.asInstanceOf[js.Any])
      __obj.asInstanceOf[FittingContext]
    }
    
    extension [Self <: FittingContext](x: Self) {
      
      inline def setInput(value: Any): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setOutput(value: Any): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
    }
  }
  
  trait FittingDef
    extends StObject
       with /* prop */ StringDictionary[Any] {
    
    /** Static values passed to the fitting during construction */
    var config: js.UndefOr[Any] = js.undefined
    
    /** Dynamic values passed to the fitting during execution */
    var input: js.UndefOr[Any] = js.undefined
    
    /** The name of the fitting of the type specified */
    var name: js.UndefOr[String] = js.undefined
    
    /** The name of the context key to which the output value is assigned */
    var output: js.UndefOr[Any] = js.undefined
    
    /**
      * If type is omitted (as it must be for in-line usage), Bagpipes will
      * first check the user fittings then the system fittings for the name and
      * use the first fitting found.
      *
      * Thus be aware that if you define a fitting with the same name as a
      * system one, your fitting will override it.
      */
    var `type`: js.UndefOr[FittingType] = js.undefined
  }
  object FittingDef {
    
    inline def apply(): FittingDef = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FittingDef]
    }
    
    extension [Self <: FittingDef](x: Self) {
      
      inline def setConfig(value: Any): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setConfigUndefined: Self = StObject.set(x, "config", js.undefined)
      
      inline def setInput(value: Any): Self = StObject.set(x, "input", value.asInstanceOf[js.Any])
      
      inline def setInputUndefined: Self = StObject.set(x, "input", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOutput(value: Any): Self = StObject.set(x, "output", value.asInstanceOf[js.Any])
      
      inline def setOutputUndefined: Self = StObject.set(x, "output", js.undefined)
      
      inline def setType(value: FittingType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  type FittingFactory = js.Function2[/* fittingDef */ FittingDef, /* bagpipes */ Any, Fitting]
  
  /* Rewritten from type alias, can be one of: 
    - typings.bagpipes.bagpipesStrings.system
    - typings.bagpipes.bagpipesStrings.user
    - java.lang.String
  */
  type FittingType = _FittingType | String
  
  type FittingTypesMap = StringDictionary[FittingFactory]
  
  type PipeDef = js.Array[Any] | String | FittingDef
  
  type PipeDefMap = StringDictionary[PipeDef]
  
  trait PipeworksOptions extends StObject {
    
    /**
      * Adds to the pre and post queues, respectively.
      * Ensures a pipe gets fitted before or after the main execution pipeline.
      */
    var affinity: Affinity
  }
  object PipeworksOptions {
    
    inline def apply(affinity: Affinity): PipeworksOptions = {
      val __obj = js.Dynamic.literal(affinity = affinity.asInstanceOf[js.Any])
      __obj.asInstanceOf[PipeworksOptions]
    }
    
    extension [Self <: PipeworksOptions](x: Self) {
      
      inline def setAffinity(value: Affinity): Self = StObject.set(x, "affinity", value.asInstanceOf[js.Any])
    }
  }
  
  trait _FittingType extends StObject
}

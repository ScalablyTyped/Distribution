package typings
package bagpipesLib.bagpipesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("bagpipes", "Bagpipes")
@js.native
class Bagpipes () extends js.Object {
  /** The `Bagpipes`' configuration */
  var config: Config = js.native
  /**
       * Hashmap of `fittingType`s (the name of a fitting) and the
       * `FittingFactory` functions used to create them
       */
  var fittingTypes: FittingTypesMap = js.native
  /** The pipes */
  var pipes: ScalablyTyped.runtime.StringDictionary[Pipe] = js.native
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
       * Finds and returns a `Pipe` by name and lazily creates if it is not defined
       * @throws {Error} Throws error if `pipeDef` pipe is not yet defined and `pipeDef` is
       *                 not supplied
       */
  def getPipe(pipeName: java.lang.String): Pipe = js.native
  /**
       * Finds and returns a `Pipe` by name and lazily creates if it is not defined
       * @throws {Error} Throws error if `pipeDef` pipe is not yet defined and `pipeDef` is
       *                 not supplied
       */
  def getPipe(pipeName: java.lang.String, pipeDef: PipeDef): Pipe = js.native
  /** Handler for errors that occure when a `Fitting` gets 'played' */
  def handleError(context: FittingContext, err: stdLib.Error): scala.Unit = js.native
  /** Loads `FittingFactory`s from file-system and adds them to `Bagpipes.fittingTypes` */
  def loadFittingTypes(): FittingTypesMap = js.native
  /**
       * Builds a new (wrappend) `Fitting`
       * @throws {Error} Throws error if an invalid (not defined) fitting typ is used
       *                 (can't find argument `fittingType` in `Bagpipes.fittingTypes`)
       */
  def newFitting(fittingType: java.lang.String, fittingDef: FittingDef): Fitting = js.native
  /** Run the pipeline */
  def play(pipe: Pipe, context: js.Any): scala.Unit = js.native
  /**
       * Wraps `Fitting` with debugging, `preflight`, `postflight`
       * and error handling functionality and returns as new Fitting
       */
  def wrapFitting(fitting: Fitting, fittingDef: FittingDef): Fitting | scala.Null = js.native
}


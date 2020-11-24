package typings.d3Chord.mod

import typings.std.CanvasRenderingContext2D
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RibbonGenerator[This, RibbonDatum, RibbonSubgroupDatum] extends js.Object {
  
  /**
    * Generates a ribbon for the given arguments.
    *
    * IMPORTANT: If the rendering context of the ribbon generator is null,
    * then the ribbon is returned as a path data string.
    *
    * The "this" context within which this function is invoked, will be the context within which the accessor methods of the generator are invoked.
    * All arguments passed into this function, will be passed to the accessor functions of the generator.
    *
    * @param d The datum representing the chord for which the ribbon is to be generated.
    */
  def apply(d: RibbonDatum, args: js.Any*): String | Null = js.native
  
  /**
    * Returns the current rendering context, which defaults to null.
    */
  def context(): CanvasRenderingContext2D | Null = js.native
  /**
    * Sets the rendering context to null and returns this ribbon generator.
    *
    * A path data string representing the generated ribbon will be returned when the generator is invoked with data. See also d3-path.
    *
    * @param context null, to remove rendering context.
    */
  def context(context: Null): this.type = js.native
  /**
    * Sets the rendering context and returns this ribbon generator.
    *
    * If the context is not null, then the generated ribbon is rendered to this context as a sequence of path method calls.
    *
    * @param context The rendering context.
    */
  def context(context: CanvasRenderingContext2D): this.type = js.native
  
  /**
    * Returns the current end angle accessor, which defaults to a function returning the "endAngle" property (assumed to be a number in radians) of the source or
    * target object returned by the source or target accessor, respectively.
    */
  def endAngle(): js.ThisFunction2[/* this */ This, /* d */ RibbonSubgroupDatum, /* repeated */ js.Any, Double] = js.native
  /**
    * Sets the end angle accessor to the specified function and returns this ribbon generator.
    *
    * @param angle An accessor function which is invoked for the source and target of the chord. The accessor function is invoked in the same "this" context as the generator was invoked in and
    * receives as the first argument the source or target object returned by the respective source or target accessor function of the generator.
    * It is also passed any additional arguments that were passed into the generator, with the exception of the first element representing the chord datum itself.
    * The function returns the end angle in radians.
    */
  def endAngle(
    angle: js.ThisFunction2[/* this */ This, /* d */ RibbonSubgroupDatum, /* repeated */ js.Any, Double]
  ): this.type = js.native
  /**
    * Sets the end angle to a fixed number in radians and returns this ribbon generator.
    *
    * @param angle A fixed numeric value for the end angle in radians.
    */
  def endAngle(angle: Double): this.type = js.native
  
  /**
    * Returns the current pad angle accessor, which defaults to a function returning 0.
    */
  def padAngle(): js.ThisFunction2[/* this */ This, /* d */ RibbonSubgroupDatum, /* repeated */ js.Any, Double] = js.native
  /**
    * Sets the pad angle accessor to the specified function and returns this ribbon generator.
    *
    * @param angle An accessor function which is invoked for the source and target of the chord. The accessor function is invoked in the same "this" context as the generator was invoked in and
    * receives as the first argument the source or target object returned by the respective source or target accessor function of the generator.
    * It is also passed any additional arguments that were passed into the generator, with the exception of the first element representing the chord datum itself.
    * The function returns the pad angle in radians.
    */
  def padAngle(
    angle: js.ThisFunction2[/* this */ This, /* d */ RibbonSubgroupDatum, /* repeated */ js.Any, Double]
  ): this.type = js.native
  /**
    * Sets the pad angle to a fixed number in radians and returns this ribbon generator.
    *
    * @param angle A fixed numeric value for the pad angle in radians.
    */
  def padAngle(angle: Double): this.type = js.native
  
  /**
    * Returns the current radius accessor, which defaults to a function returning the "radius" property (assumed to be a number) of the source or
    * target object returned by the source or target accessor, respectively.
    */
  def radius(): js.ThisFunction2[/* this */ This, /* d */ RibbonSubgroupDatum, /* repeated */ js.Any, Double] = js.native
  /**
    * Sets the radius accessor to the specified function and returns this ribbon generator.
    *
    * @param radius An accessor function which is invoked for the source and target of the chord. The accessor function is invoked in the same "this" context as the generator was invoked in and
    * receives as the first argument the source or target object returned by the respective source or target accessor function of the generator.
    * It is also passed any additional arguments that were passed into the generator, with the exception of the first element representing the chord datum itself.
    * The function returns the radius value.
    */
  def radius(
    radius: js.ThisFunction2[/* this */ This, /* d */ RibbonSubgroupDatum, /* repeated */ js.Any, Double]
  ): this.type = js.native
  /**
    * Sets the radius to a fixed number and returns this ribbon generator.
    *
    * @param radius A fixed numeric value for the radius.
    */
  def radius(radius: Double): this.type = js.native
  
  /**
    * Returns the current source accessor, which defaults to a function returning the "source" property of the first argument passed into the accessor.
    */
  def source(): js.ThisFunction2[/* this */ This, /* d */ RibbonDatum, /* repeated */ js.Any, RibbonSubgroupDatum] = js.native
  /**
    * Sets the source accessor to the specified function and returns this ribbon generator.
    *
    * @param source An accessor function returning the source datum of the chord. The accessor function is invoked in the same "this" context as the generator was invoked in and
    * receives the same arguments that were passed into the ribbon generator.
    */
  def source(
    source: js.ThisFunction2[/* this */ This, /* d */ RibbonDatum, /* repeated */ js.Any, RibbonSubgroupDatum]
  ): this.type = js.native
  
  /**
    * Returns the current source radius accessor, which defaults to a function returning the "radius" property (assumed to be a number) of the source or
    * target object returned by the source or target accessor, respectively.
    */
  def sourceRadius(): js.ThisFunction2[/* this */ This, /* d */ RibbonSubgroupDatum, /* repeated */ js.Any, Double] = js.native
  /**
    * Sets the source radius accessor to the specified function and returns this ribbon generator.
    *
    * @param radius An accessor function which is invoked for the source and target of the chord. The accessor function is invoked in the same "this" context as the generator was invoked in and
    * receives as the first argument the source or target object returned by the respective source or target accessor function of the generator.
    * It is also passed any additional arguments that were passed into the generator, with the exception of the first element representing the chord datum itself.
    * The function returns the source radius value.
    */
  def sourceRadius(
    radius: js.ThisFunction2[/* this */ This, /* d */ RibbonSubgroupDatum, /* repeated */ js.Any, Double]
  ): this.type = js.native
  /**
    * Sets the source radius to a fixed number and returns this ribbon generator.
    *
    * @param radius A fixed numeric value for the source radius.
    */
  def sourceRadius(radius: Double): this.type = js.native
  
  /**
    * Returns the current start angle accessor, which defaults to a function returning the "startAngle" property (assumed to be a number in radians) of the source or
    * target object returned by the source or target accessor, respectively.
    */
  def startAngle(): js.ThisFunction2[/* this */ This, /* d */ RibbonSubgroupDatum, /* repeated */ js.Any, Double] = js.native
  /**
    * Sets the start angle accessor to the specified function and returns this ribbon generator.
    *
    * @param angle An accessor function which is invoked for the source and target of the chord. The accessor function is invoked in the same "this" context as the generator was invoked in and
    * receives as the first argument the source or target object returned by the respective source or target accessor function of the generator.
    * It is also passed any additional arguments that were passed into the generator, with the exception of the first element representing the chord datum itself.
    * The function returns the start angle in radians.
    */
  def startAngle(
    angle: js.ThisFunction2[/* this */ This, /* d */ RibbonSubgroupDatum, /* repeated */ js.Any, Double]
  ): this.type = js.native
  /**
    * Sets the start angle to a fixed number in radians and returns this ribbon generator.
    *
    * @param angle A fixed numeric value for the start angle in radians.
    */
  def startAngle(angle: Double): this.type = js.native
  
  /**
    * Returns the current target accessor, which defaults to a function returning the "target" property of the first argument passed into the accessor.
    */
  def target(): js.ThisFunction2[/* this */ This, /* d */ RibbonDatum, /* repeated */ js.Any, RibbonSubgroupDatum] = js.native
  /**
    * Sets the target accessor to the specified function and returns this ribbon generator.
    *
    * @param target An accessor function returning the target datum of the chord. The accessor function is invoked in the same "this" context as the generator was invoked in and
    * receives the same arguments that were passed into the ribbon generator.
    */
  def target(
    target: js.ThisFunction2[/* this */ This, /* d */ RibbonDatum, /* repeated */ js.Any, RibbonSubgroupDatum]
  ): this.type = js.native
  
  /**
    * Returns the current target radius accessor, which defaults to a function returning the "radius" property (assumed to be a number) of the source or
    * target object returned by the source or target accessor, respectively.
    */
  def targetRadius(): js.ThisFunction2[/* this */ This, /* d */ RibbonSubgroupDatum, /* repeated */ js.Any, Double] = js.native
  /**
    * Sets the target radius accessor to the specified function and returns this ribbon generator.
    *
    * @param radius An accessor function which is invoked for the source and target of the chord. The accessor function is invoked in the same "this" context as the generator was invoked in and
    * receives as the first argument the source or target object returned by the respective source or target accessor function of the generator.
    * It is also passed any additional arguments that were passed into the generator, with the exception of the first element representing the chord datum itself.
    * The function returns the target radius value.
    */
  def targetRadius(
    radius: js.ThisFunction2[/* this */ This, /* d */ RibbonSubgroupDatum, /* repeated */ js.Any, Double]
  ): this.type = js.native
  /**
    * Sets the target radius to a fixed number and returns this ribbon generator.
    *
    * @param radius A fixed numeric value for the target radius.
    */
  def targetRadius(radius: Double): this.type = js.native
}

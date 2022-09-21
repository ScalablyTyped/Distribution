package typings.d3Chord

import typings.std.Array
import typings.std.CanvasRenderingContext2D
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("d3-chord", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def chord(): ChordLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("chord")().asInstanceOf[ChordLayout]
  
  inline def chordDirected(): ChordLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("chordDirected")().asInstanceOf[ChordLayout]
  
  inline def chordTranspose(): ChordLayout = ^.asInstanceOf[js.Dynamic].applyDynamic("chordTranspose")().asInstanceOf[ChordLayout]
  
  inline def ribbon(): RibbonGenerator[Any, Ribbon_, RibbonSubgroup] = ^.asInstanceOf[js.Dynamic].applyDynamic("ribbon")().asInstanceOf[RibbonGenerator[Any, Ribbon_, RibbonSubgroup]]
  
  inline def ribbonArrow(): RibbonArrowGenerator[Any, Ribbon_, RibbonSubgroup] = ^.asInstanceOf[js.Dynamic].applyDynamic("ribbonArrow")().asInstanceOf[RibbonArrowGenerator[Any, Ribbon_, RibbonSubgroup]]
  
  inline def ribbonArrow_DatumSubgroupDatum[Datum, SubgroupDatum](): RibbonArrowGenerator[Any, Datum, SubgroupDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("ribbonArrow")().asInstanceOf[RibbonArrowGenerator[Any, Datum, SubgroupDatum]]
  
  inline def ribbonArrow_ThisDatumSubgroupDatum[This, Datum, SubgroupDatum](): RibbonArrowGenerator[This, Datum, SubgroupDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("ribbonArrow")().asInstanceOf[RibbonArrowGenerator[This, Datum, SubgroupDatum]]
  
  inline def ribbon_DatumSubgroupDatum[Datum, SubgroupDatum](): RibbonGenerator[Any, Datum, SubgroupDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("ribbon")().asInstanceOf[RibbonGenerator[Any, Datum, SubgroupDatum]]
  
  inline def ribbon_ThisDatumSubgroupDatum[This, Datum, SubgroupDatum](): RibbonGenerator[This, Datum, SubgroupDatum] = ^.asInstanceOf[js.Dynamic].applyDynamic("ribbon")().asInstanceOf[RibbonGenerator[This, Datum, SubgroupDatum]]
  
  trait ChordGroup extends StObject {
    
    /**
      * The end angle of the chord group in radians
      */
    var endAngle: Double
    
    /**
      * The node index i
      */
    var index: Double
    
    /**
      * The start angle of the chord group in radians
      */
    var startAngle: Double
    
    /**
      * The total outgoing flow value for node i
      */
    var value: Double
  }
  object ChordGroup {
    
    inline def apply(endAngle: Double, index: Double, startAngle: Double, value: Double): ChordGroup = {
      val __obj = js.Dynamic.literal(endAngle = endAngle.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChordGroup]
    }
    
    extension [Self <: ChordGroup](x: Self) {
      
      inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ChordLayout extends StObject {
    
    /**
      * Computes the chord layout for the specified square matrix of size n×n, where the matrix represents the directed flow amongst a network (a complete digraph) of n nodes.
      *
      * @param matrix An (n x n) matrix representing the directed flow amongst a network (a complete digraph) of n nodes.The given matrix must be an array of length n,
      * where each element matrix[i] is an array of n numbers, where each matrix[i][j] represents the flow from the ith node in the network to the jth node.
      * Each number matrix[i][j] must be nonnegative, though it can be zero if there is no flow from node i to node j.
      */
    def apply(matrix: js.Array[js.Array[Double]]): Chords = js.native
    
    /**
      * Returns the current pad angle in radians, which defaults to zero.
      */
    def padAngle(): Double = js.native
    /**
      * Sets the pad angle between adjacent groups to the specified number in radians and returns this chord layout.
      *
      * The default is zero.
      *
      * @param angle Pad angle between adjacent groups in radians.
      */
    def padAngle(angle: Double): this.type = js.native
    
    /**
      * Sets the chord comparator to the specified function or null and returns this chord layout.
      * If the chord comparator is non-null, it is used to sort the chords by their combined flow; this only affects the z-order of the chords.
      * See also d3.ascending and d3.descending.
      */
    def sortChords(): this.type = js.native
    def sortChords(compare: js.Function2[/* a */ Double, /* b */ Double, Double]): this.type = js.native
    /**
      * Returns the current chord comparator, which defaults to null.
      */
    @JSName("sortChords")
    def sortChords_Union(): (js.Function2[/* a */ Double, /* b */ Double, Double]) | Null = js.native
    
    /**
      * Sets the group comparator to the specified function or null and returns this chord layout.
      * If the group comparator is non-null, it is used to sort the groups by their total outflow.
      * See also d3.ascending and d3.descending.
      */
    def sortGroups(): this.type = js.native
    def sortGroups(compare: js.Function2[/* a */ Double, /* b */ Double, Double]): this.type = js.native
    /**
      * Returns the current group comparator, which defaults to null.
      */
    @JSName("sortGroups")
    def sortGroups_Union(): (js.Function2[/* a */ Double, /* b */ Double, Double]) | Null = js.native
    
    /**
      * Sets the subgroup comparator to the specified function or null and returns this chord layout.
      * If the subgroup comparator is non-null, it is used to sort the subgroups corresponding to matrix[i][0 … n - 1] for a given group i by their total outflow.
      * See also d3.ascending and d3.descending.
      */
    def sortSubgroups(): this.type = js.native
    def sortSubgroups(compare: js.Function2[/* a */ Double, /* b */ Double, Double]): this.type = js.native
    /**
      * Returns the current subgroup comparator, which defaults to null.
      */
    @JSName("sortSubgroups")
    def sortSubgroups_Union(): (js.Function2[/* a */ Double, /* b */ Double, Double]) | Null = js.native
  }
  
  trait ChordSubgroup extends StObject {
    
    /***
      * End angle of the chord subgroup in radians
      */
    var endAngle: Double
    
    /**
      * The node index i
      */
    var index: Double
    
    /**
      * Start angle of the chord subgroup in radians
      */
    var startAngle: Double
    
    /**
      * The flow value in matrix[i][j] from node i to node j
      */
    var value: Double
  }
  object ChordSubgroup {
    
    inline def apply(endAngle: Double, index: Double, startAngle: Double, value: Double): ChordSubgroup = {
      val __obj = js.Dynamic.literal(endAngle = endAngle.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ChordSubgroup]
    }
    
    extension [Self <: ChordSubgroup](x: Self) {
      
      inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Chord_ extends StObject {
    
    /**
      * Chord subgroup constituting the source of Chord
      */
    var source: ChordSubgroup
    
    /**
      * Chord subgroup constituting the Target of Chord
      */
    var target: ChordSubgroup
  }
  object Chord_ {
    
    inline def apply(source: ChordSubgroup, target: ChordSubgroup): Chord_ = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Chord_]
    }
    
    extension [Self <: Chord_](x: Self) {
      
      inline def setSource(value: ChordSubgroup): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: ChordSubgroup): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Chords
    extends StObject
       with Array[Chord_] {
    
    /**
      * An array of length n, where each group represents the combined outflow for node i,
      * corresponding to the elements matrix[i][0 … n - 1]
      */
    var groups: js.Array[ChordGroup] = js.native
  }
  
  @js.native
  trait RibbonArrowGenerator[This, RibbonDatum, RibbonSubgroupDatum]
    extends StObject
       with RibbonGenerator[This, RibbonDatum, RibbonSubgroupDatum] {
    
    def headRadius(): js.ThisFunction2[/* this */ This, /* d */ RibbonSubgroupDatum, /* repeated */ Any, Double] = js.native
    def headRadius(radius: js.ThisFunction2[/* this */ This, /* d */ RibbonSubgroupDatum, /* repeated */ Any, Double]): this.type = js.native
    def headRadius(radius: Double): this.type = js.native
  }
  
  @js.native
  trait RibbonGenerator[This, RibbonDatum, RibbonSubgroupDatum] extends StObject {
    
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
    def apply(d: RibbonDatum, args: Any*): String | Null = js.native
    
    /**
      * Sets the context and returns this ribbon generator.
      * If the context is not null, then the generated ribbon is rendered to this context as a sequence of path method calls.
      * Otherwise, a path data string representing the generated ribbon is returned.
      * See also d3-path.
      */
    def context(): this.type = js.native
    def context(context: CanvasRenderingContext2D): this.type = js.native
    /**
      * Returns the current rendering context, which defaults to null.
      */
    @JSName("context")
    def context_Union(): CanvasRenderingContext2D | Null = js.native
    
    /**
      * Returns the current end angle accessor, which defaults to a function returning the "endAngle" property (assumed to be a number in radians) of the source or
      * target object returned by the source or target accessor, respectively.
      */
    def endAngle(): js.ThisFunction2[/* this */ This, /* d */ RibbonSubgroupDatum, /* repeated */ Any, Double] = js.native
    /**
      * Sets the end angle accessor to the specified function and returns this ribbon generator.
      *
      * @param angle An accessor function which is invoked for the source and target of the chord. The accessor function is invoked in the same "this" context as the generator was invoked in and
      * receives as the first argument the source or target object returned by the respective source or target accessor function of the generator.
      * It is also passed any additional arguments that were passed into the generator, with the exception of the first element representing the chord datum itself.
      * The function returns the end angle in radians.
      */
    def endAngle(angle: js.ThisFunction2[/* this */ This, /* d */ RibbonSubgroupDatum, /* repeated */ Any, Double]): this.type = js.native
    /**
      * Sets the end angle to a fixed number in radians and returns this ribbon generator.
      *
      * @param angle A fixed numeric value for the end angle in radians.
      */
    def endAngle(angle: Double): this.type = js.native
    
    /**
      * Returns the current pad angle accessor, which defaults to a function returning 0.
      */
    def padAngle(): js.ThisFunction2[/* this */ This, /* d */ RibbonSubgroupDatum, /* repeated */ Any, Double] = js.native
    /**
      * Sets the pad angle accessor to the specified function and returns this ribbon generator.
      *
      * @param angle An accessor function which is invoked for the source and target of the chord. The accessor function is invoked in the same "this" context as the generator was invoked in and
      * receives as the first argument the source or target object returned by the respective source or target accessor function of the generator.
      * It is also passed any additional arguments that were passed into the generator, with the exception of the first element representing the chord datum itself.
      * The function returns the pad angle in radians.
      */
    def padAngle(angle: js.ThisFunction2[/* this */ This, /* d */ RibbonSubgroupDatum, /* repeated */ Any, Double]): this.type = js.native
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
    def radius(): js.ThisFunction2[/* this */ This, /* d */ RibbonSubgroupDatum, /* repeated */ Any, Double] = js.native
    /**
      * Sets the radius accessor to the specified function and returns this ribbon generator.
      *
      * @param radius An accessor function which is invoked for the source and target of the chord. The accessor function is invoked in the same "this" context as the generator was invoked in and
      * receives as the first argument the source or target object returned by the respective source or target accessor function of the generator.
      * It is also passed any additional arguments that were passed into the generator, with the exception of the first element representing the chord datum itself.
      * The function returns the radius value.
      */
    def radius(radius: js.ThisFunction2[/* this */ This, /* d */ RibbonSubgroupDatum, /* repeated */ Any, Double]): this.type = js.native
    /**
      * Sets the radius to a fixed number and returns this ribbon generator.
      *
      * @param radius A fixed numeric value for the radius.
      */
    def radius(radius: Double): this.type = js.native
    
    /**
      * Returns the current source accessor, which defaults to a function returning the "source" property of the first argument passed into the accessor.
      */
    def source(): js.ThisFunction2[/* this */ This, /* d */ RibbonDatum, /* repeated */ Any, RibbonSubgroupDatum] = js.native
    /**
      * Sets the source accessor to the specified function and returns this ribbon generator.
      *
      * @param source An accessor function returning the source datum of the chord. The accessor function is invoked in the same "this" context as the generator was invoked in and
      * receives the same arguments that were passed into the ribbon generator.
      */
    def source(
      source: js.ThisFunction2[/* this */ This, /* d */ RibbonDatum, /* repeated */ Any, RibbonSubgroupDatum]
    ): this.type = js.native
    
    /**
      * Returns the current source radius accessor, which defaults to a function returning the "radius" property (assumed to be a number) of the source or
      * target object returned by the source or target accessor, respectively.
      */
    def sourceRadius(): js.ThisFunction2[/* this */ This, /* d */ RibbonSubgroupDatum, /* repeated */ Any, Double] = js.native
    /**
      * Sets the source radius accessor to the specified function and returns this ribbon generator.
      *
      * @param radius An accessor function which is invoked for the source and target of the chord. The accessor function is invoked in the same "this" context as the generator was invoked in and
      * receives as the first argument the source or target object returned by the respective source or target accessor function of the generator.
      * It is also passed any additional arguments that were passed into the generator, with the exception of the first element representing the chord datum itself.
      * The function returns the source radius value.
      */
    def sourceRadius(radius: js.ThisFunction2[/* this */ This, /* d */ RibbonSubgroupDatum, /* repeated */ Any, Double]): this.type = js.native
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
    def startAngle(): js.ThisFunction2[/* this */ This, /* d */ RibbonSubgroupDatum, /* repeated */ Any, Double] = js.native
    /**
      * Sets the start angle accessor to the specified function and returns this ribbon generator.
      *
      * @param angle An accessor function which is invoked for the source and target of the chord. The accessor function is invoked in the same "this" context as the generator was invoked in and
      * receives as the first argument the source or target object returned by the respective source or target accessor function of the generator.
      * It is also passed any additional arguments that were passed into the generator, with the exception of the first element representing the chord datum itself.
      * The function returns the start angle in radians.
      */
    def startAngle(angle: js.ThisFunction2[/* this */ This, /* d */ RibbonSubgroupDatum, /* repeated */ Any, Double]): this.type = js.native
    /**
      * Sets the start angle to a fixed number in radians and returns this ribbon generator.
      *
      * @param angle A fixed numeric value for the start angle in radians.
      */
    def startAngle(angle: Double): this.type = js.native
    
    /**
      * Returns the current target accessor, which defaults to a function returning the "target" property of the first argument passed into the accessor.
      */
    def target(): js.ThisFunction2[/* this */ This, /* d */ RibbonDatum, /* repeated */ Any, RibbonSubgroupDatum] = js.native
    /**
      * Sets the target accessor to the specified function and returns this ribbon generator.
      *
      * @param target An accessor function returning the target datum of the chord. The accessor function is invoked in the same "this" context as the generator was invoked in and
      * receives the same arguments that were passed into the ribbon generator.
      */
    def target(
      target: js.ThisFunction2[/* this */ This, /* d */ RibbonDatum, /* repeated */ Any, RibbonSubgroupDatum]
    ): this.type = js.native
    
    /**
      * Returns the current target radius accessor, which defaults to a function returning the "radius" property (assumed to be a number) of the source or
      * target object returned by the source or target accessor, respectively.
      */
    def targetRadius(): js.ThisFunction2[/* this */ This, /* d */ RibbonSubgroupDatum, /* repeated */ Any, Double] = js.native
    /**
      * Sets the target radius accessor to the specified function and returns this ribbon generator.
      *
      * @param radius An accessor function which is invoked for the source and target of the chord. The accessor function is invoked in the same "this" context as the generator was invoked in and
      * receives as the first argument the source or target object returned by the respective source or target accessor function of the generator.
      * It is also passed any additional arguments that were passed into the generator, with the exception of the first element representing the chord datum itself.
      * The function returns the target radius value.
      */
    def targetRadius(radius: js.ThisFunction2[/* this */ This, /* d */ RibbonSubgroupDatum, /* repeated */ Any, Double]): this.type = js.native
    /**
      * Sets the target radius to a fixed number and returns this ribbon generator.
      *
      * @param radius A fixed numeric value for the target radius.
      */
    def targetRadius(radius: Double): this.type = js.native
  }
  
  trait RibbonSubgroup extends StObject {
    
    /**
      * End angle of the ribbon subgroup in radians
      */
    var endAngle: Double
    
    /**
      * Radius of the ribbon subgroup
      */
    var radius: Double
    
    /**
      * Start angle of the ribbon subgroup in radians
      */
    var startAngle: Double
  }
  object RibbonSubgroup {
    
    inline def apply(endAngle: Double, radius: Double, startAngle: Double): RibbonSubgroup = {
      val __obj = js.Dynamic.literal(endAngle = endAngle.asInstanceOf[js.Any], radius = radius.asInstanceOf[js.Any], startAngle = startAngle.asInstanceOf[js.Any])
      __obj.asInstanceOf[RibbonSubgroup]
    }
    
    extension [Self <: RibbonSubgroup](x: Self) {
      
      inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
    }
  }
  
  trait Ribbon_ extends StObject {
    
    /**
      * Ribbon subgroup constituting the source of the Ribbon
      */
    var source: RibbonSubgroup
    
    /**
      * Ribbon subgroup constituting the target of the Ribbon
      */
    var target: RibbonSubgroup
  }
  object Ribbon_ {
    
    inline def apply(source: RibbonSubgroup, target: RibbonSubgroup): Ribbon_ = {
      val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ribbon_]
    }
    
    extension [Self <: Ribbon_](x: Self) {
      
      inline def setSource(value: RibbonSubgroup): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: RibbonSubgroup): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}

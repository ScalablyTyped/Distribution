package typings.cathoQuantum

import typings.cathoQuantum.anon.BreakpointsComponents
import typings.cathoQuantum.anon.`14`
import typings.cathoQuantum.anon.`15`
import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridMod {
  
  @JSImport("@catho/quantum/Grid", "Col")
  @js.native
  open class Col protected ()
    extends Component[ColProps, js.Object, Any] {
    def this(props: ColProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ColProps, context: Any) = this()
  }
  
  @JSImport("@catho/quantum/Grid", "Container")
  @js.native
  open class Container protected ()
    extends Component[ContainerProps, js.Object, Any] {
    def this(props: ContainerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: ContainerProps, context: Any) = this()
  }
  
  @JSImport("@catho/quantum/Grid", "Hide")
  @js.native
  open class Hide protected ()
    extends Component[HideProps, js.Object, Any] {
    def this(props: HideProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: HideProps, context: Any) = this()
  }
  
  @JSImport("@catho/quantum/Grid", "Row")
  @js.native
  open class Row protected ()
    extends Component[RowProps, js.Object, Any] {
    def this(props: RowProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: RowProps, context: Any) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.cathoQuantum.cathoQuantumStrings.xsmall
    - typings.cathoQuantum.cathoQuantumStrings.small
    - typings.cathoQuantum.cathoQuantumStrings.medium
    - typings.cathoQuantum.cathoQuantumStrings.large
  */
  trait BreakpointsType extends StObject
  
  trait ColProps extends StObject {
    
    var hide: js.UndefOr[BreakpointsType | js.Array[BreakpointsType]] = js.undefined
    
    var large: js.UndefOr[Double] = js.undefined
    
    var `large-offset`: js.UndefOr[Double] = js.undefined
    
    var medium: js.UndefOr[Double] = js.undefined
    
    var `medium-offset`: js.UndefOr[Double] = js.undefined
    
    var `no-gutters`: js.UndefOr[Boolean] = js.undefined
    
    var small: js.UndefOr[Double] = js.undefined
    
    var `small-offset`: js.UndefOr[Double] = js.undefined
    
    var xsmall: js.UndefOr[Double] = js.undefined
    
    var `xsmall-offset`: js.UndefOr[Double] = js.undefined
  }
  object ColProps {
    
    inline def apply(): ColProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ColProps]
    }
    
    extension [Self <: ColProps](x: Self) {
      
      inline def setHide(value: BreakpointsType | js.Array[BreakpointsType]): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      inline def setHideVarargs(value: BreakpointsType*): Self = StObject.set(x, "hide", js.Array(value*))
      
      inline def setLarge(value: Double): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      inline def `setLarge-offset`(value: Double): Self = StObject.set(x, "large-offset", value.asInstanceOf[js.Any])
      
      inline def `setLarge-offsetUndefined`: Self = StObject.set(x, "large-offset", js.undefined)
      
      inline def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
      
      inline def setMedium(value: Double): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
      
      inline def `setMedium-offset`(value: Double): Self = StObject.set(x, "medium-offset", value.asInstanceOf[js.Any])
      
      inline def `setMedium-offsetUndefined`: Self = StObject.set(x, "medium-offset", js.undefined)
      
      inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
      
      inline def `setNo-gutters`(value: Boolean): Self = StObject.set(x, "no-gutters", value.asInstanceOf[js.Any])
      
      inline def `setNo-guttersUndefined`: Self = StObject.set(x, "no-gutters", js.undefined)
      
      inline def setSmall(value: Double): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      inline def `setSmall-offset`(value: Double): Self = StObject.set(x, "small-offset", value.asInstanceOf[js.Any])
      
      inline def `setSmall-offsetUndefined`: Self = StObject.set(x, "small-offset", js.undefined)
      
      inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
      
      inline def setXsmall(value: Double): Self = StObject.set(x, "xsmall", value.asInstanceOf[js.Any])
      
      inline def `setXsmall-offset`(value: Double): Self = StObject.set(x, "xsmall-offset", value.asInstanceOf[js.Any])
      
      inline def `setXsmall-offsetUndefined`: Self = StObject.set(x, "xsmall-offset", js.undefined)
      
      inline def setXsmallUndefined: Self = StObject.set(x, "xsmall", js.undefined)
    }
  }
  
  trait ContainerProps extends StObject {
    
    var fluid: js.UndefOr[Boolean] = js.undefined
    
    var hide: js.UndefOr[BreakpointsType | js.Array[String]] = js.undefined
    
    var `no-gutters`: js.UndefOr[Boolean] = js.undefined
    
    var theme: js.UndefOr[BreakpointsComponents] = js.undefined
    
    var withBreakpoints: js.UndefOr[Boolean] = js.undefined
  }
  object ContainerProps {
    
    inline def apply(): ContainerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ContainerProps]
    }
    
    extension [Self <: ContainerProps](x: Self) {
      
      inline def setFluid(value: Boolean): Self = StObject.set(x, "fluid", value.asInstanceOf[js.Any])
      
      inline def setFluidUndefined: Self = StObject.set(x, "fluid", js.undefined)
      
      inline def setHide(value: BreakpointsType | js.Array[String]): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      inline def setHideVarargs(value: String*): Self = StObject.set(x, "hide", js.Array(value*))
      
      inline def `setNo-gutters`(value: Boolean): Self = StObject.set(x, "no-gutters", value.asInstanceOf[js.Any])
      
      inline def `setNo-guttersUndefined`: Self = StObject.set(x, "no-gutters", js.undefined)
      
      inline def setTheme(value: BreakpointsComponents): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setWithBreakpoints(value: Boolean): Self = StObject.set(x, "withBreakpoints", value.asInstanceOf[js.Any])
      
      inline def setWithBreakpointsUndefined: Self = StObject.set(x, "withBreakpoints", js.undefined)
    }
  }
  
  trait HideProps extends StObject {
    
    var large: js.UndefOr[Boolean] = js.undefined
    
    var medium: js.UndefOr[Boolean] = js.undefined
    
    var small: js.UndefOr[Boolean] = js.undefined
    
    var theme: js.UndefOr[`14`] = js.undefined
    
    var xsmall: js.UndefOr[Boolean] = js.undefined
  }
  object HideProps {
    
    inline def apply(): HideProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HideProps]
    }
    
    extension [Self <: HideProps](x: Self) {
      
      inline def setLarge(value: Boolean): Self = StObject.set(x, "large", value.asInstanceOf[js.Any])
      
      inline def setLargeUndefined: Self = StObject.set(x, "large", js.undefined)
      
      inline def setMedium(value: Boolean): Self = StObject.set(x, "medium", value.asInstanceOf[js.Any])
      
      inline def setMediumUndefined: Self = StObject.set(x, "medium", js.undefined)
      
      inline def setSmall(value: Boolean): Self = StObject.set(x, "small", value.asInstanceOf[js.Any])
      
      inline def setSmallUndefined: Self = StObject.set(x, "small", js.undefined)
      
      inline def setTheme(value: `14`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setXsmall(value: Boolean): Self = StObject.set(x, "xsmall", value.asInstanceOf[js.Any])
      
      inline def setXsmallUndefined: Self = StObject.set(x, "xsmall", js.undefined)
    }
  }
  
  trait RowProps extends StObject {
    
    var children: js.Array[ReactNode] | ReactNode
    
    var hide: js.UndefOr[BreakpointsType | js.Array[BreakpointsType]] = js.undefined
    
    var `no-gutters`: js.UndefOr[Boolean] = js.undefined
    
    var theme: js.UndefOr[`15`] = js.undefined
  }
  object RowProps {
    
    inline def apply(): RowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RowProps]
    }
    
    extension [Self <: RowProps](x: Self) {
      
      inline def setChildren(value: js.Array[ReactNode] | ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: ReactNode*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setHide(value: BreakpointsType | js.Array[BreakpointsType]): Self = StObject.set(x, "hide", value.asInstanceOf[js.Any])
      
      inline def setHideUndefined: Self = StObject.set(x, "hide", js.undefined)
      
      inline def setHideVarargs(value: BreakpointsType*): Self = StObject.set(x, "hide", js.Array(value*))
      
      inline def `setNo-gutters`(value: Boolean): Self = StObject.set(x, "no-gutters", value.asInstanceOf[js.Any])
      
      inline def `setNo-guttersUndefined`: Self = StObject.set(x, "no-gutters", js.undefined)
      
      inline def setTheme(value: `15`): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
}

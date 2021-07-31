package typings.baseui

import typings.react.mod.Component
import typings.react.mod.FC
import typings.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object spinnerMod {
  
  @js.native
  sealed trait SIZE extends StObject
  @JSImport("baseui/spinner", "SIZE")
  @js.native
  object SIZE extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[SIZE & String] = js.native
    
    @js.native
    sealed trait large
      extends StObject
         with SIZE
    /* "large" */ val large: typings.baseui.spinnerMod.SIZE.large & String = js.native
    
    @js.native
    sealed trait medium
      extends StObject
         with SIZE
    /* "medium" */ val medium: typings.baseui.spinnerMod.SIZE.medium & String = js.native
    
    @js.native
    sealed trait small
      extends StObject
         with SIZE
    /* "small" */ val small: typings.baseui.spinnerMod.SIZE.small & String = js.native
  }
  
  @JSImport("baseui/spinner", "Spinner")
  @js.native
  class Spinner protected ()
    extends Component[SpinnerProps, js.Object, js.Any] {
    def this(props: SpinnerProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: SpinnerProps, context: js.Any) = this()
  }
  
  @JSImport("baseui/spinner", "SpinnerDeterminate")
  @js.native
  val SpinnerDeterminate: FC[SpinnerDeterminateProps] = js.native
  
  @JSImport("baseui/spinner", "StyledActivePath")
  @js.native
  val StyledActivePath: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/spinner", "StyledSpinnerNext")
  @js.native
  val StyledSpinnerNext: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/spinner", "StyledSvg")
  @js.native
  val StyledSvg: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/spinner", "StyledTrackPath")
  @js.native
  val StyledTrackPath: StyletronComponent[js.Any] = js.native
  
  trait SpinnerDeterminateOverrides extends StObject {
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Svg: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Text: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var TrackBackground: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var TrackForeground: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
  }
  object SpinnerDeterminateOverrides {
    
    @scala.inline
    def apply(): SpinnerDeterminateOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpinnerDeterminateOverrides]
    }
    
    @scala.inline
    implicit class SpinnerDeterminateOverridesMutableBuilder[Self <: SpinnerDeterminateOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      @scala.inline
      def setSvg(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Svg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvgUndefined: Self = StObject.set(x, "Svg", js.undefined)
      
      @scala.inline
      def setText(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "Text", js.undefined)
      
      @scala.inline
      def setTrackBackground(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "TrackBackground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackBackgroundUndefined: Self = StObject.set(x, "TrackBackground", js.undefined)
      
      @scala.inline
      def setTrackForeground(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "TrackForeground", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackForegroundUndefined: Self = StObject.set(x, "TrackForeground", js.undefined)
    }
  }
  
  trait SpinnerDeterminateProps extends StObject {
    
    var animate: js.UndefOr[Boolean] = js.undefined
    
    var `inline`: js.UndefOr[Boolean] = js.undefined
    
    var overrides: js.UndefOr[SpinnerDeterminateOverrides] = js.undefined
    
    var progress: js.UndefOr[Double] = js.undefined
    
    var size: js.UndefOr[
        /* import warning: importer.ImportType#apply Failed type conversion: baseui.baseui/spinner.SIZE[keyof baseui.baseui/spinner.SIZE] */ js.Any
      ] = js.undefined
  }
  object SpinnerDeterminateProps {
    
    @scala.inline
    def apply(): SpinnerDeterminateProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpinnerDeterminateProps]
    }
    
    @scala.inline
    implicit class SpinnerDeterminatePropsMutableBuilder[Self <: SpinnerDeterminateProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      @scala.inline
      def setInline(value: Boolean): Self = StObject.set(x, "inline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlineUndefined: Self = StObject.set(x, "inline", js.undefined)
      
      @scala.inline
      def setOverrides(value: SpinnerDeterminateOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
      
      @scala.inline
      def setSize(
        value: /* import warning: importer.ImportType#apply Failed type conversion: baseui.baseui/spinner.SIZE[keyof baseui.baseui/spinner.SIZE] */ js.Any
      ): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait SpinnerOverrides extends StObject {
    
    var ActivePath: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Svg: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var TrackPath: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
  }
  object SpinnerOverrides {
    
    @scala.inline
    def apply(): SpinnerOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpinnerOverrides]
    }
    
    @scala.inline
    implicit class SpinnerOverridesMutableBuilder[Self <: SpinnerOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActivePath(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "ActivePath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActivePathUndefined: Self = StObject.set(x, "ActivePath", js.undefined)
      
      @scala.inline
      def setSvg(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Svg", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSvgUndefined: Self = StObject.set(x, "Svg", js.undefined)
      
      @scala.inline
      def setTrackPath(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "TrackPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrackPathUndefined: Self = StObject.set(x, "TrackPath", js.undefined)
    }
  }
  
  trait SpinnerProps extends StObject {
    
    var `aria-label`: js.UndefOr[String] = js.undefined
    
    var color: js.UndefOr[String] = js.undefined
    
    var overrides: js.UndefOr[SpinnerOverrides] = js.undefined
    
    var size: js.UndefOr[Double | String] = js.undefined
    
    var title: js.UndefOr[String] = js.undefined
  }
  object SpinnerProps {
    
    @scala.inline
    def apply(): SpinnerProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SpinnerProps]
    }
    
    @scala.inline
    implicit class SpinnerPropsMutableBuilder[Self <: SpinnerProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setOverrides(value: SpinnerOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setSize(value: Double | String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}

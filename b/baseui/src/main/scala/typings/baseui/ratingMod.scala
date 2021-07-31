package typings.baseui

import typings.baseui.anon.ValueNumber
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ratingMod {
  
  @JSImport("baseui/rating", "EmoticonRating")
  @js.native
  class EmoticonRating protected ()
    extends Component[EmoticonRatingProps, RatingState, js.Any] {
    def this(props: EmoticonRatingProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: EmoticonRatingProps, context: js.Any) = this()
    
    def renderRatingContents(): js.Array[ReactNode] = js.native
    
    def selectItem(value: Double): Unit = js.native
    
    def updatePreview(): Unit = js.native
    def updatePreview(previewIndex: Double): Unit = js.native
  }
  
  @JSImport("baseui/rating", "StarRating")
  @js.native
  class StarRating protected ()
    extends Component[StarRatingProps, RatingState, js.Any] {
    def this(props: StarRatingProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: StarRatingProps, context: js.Any) = this()
    
    def renderRatingContents(): js.Array[ReactNode] = js.native
    
    def selectItem(value: Double): Unit = js.native
    
    def updatePreview(): Unit = js.native
    def updatePreview(previewIndex: Double): Unit = js.native
  }
  
  @JSImport("baseui/rating", "StyledEmoticon")
  @js.native
  val StyledEmoticon: StyletronComponent[StyledRatingItemProps] = js.native
  
  @JSImport("baseui/rating", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[StyledRootProps] = js.native
  
  @JSImport("baseui/rating", "StyledStar")
  @js.native
  val StyledStar: StyletronComponent[StyledRatingItemProps] = js.native
  
  trait EmoticonRatingProps extends StObject {
    
    var onChange: js.UndefOr[js.Function1[/* args */ ValueNumber, js.Any]] = js.undefined
    
    var overrides: js.UndefOr[RatingOverrides] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object EmoticonRatingProps {
    
    @scala.inline
    def apply(): EmoticonRatingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EmoticonRatingProps]
    }
    
    @scala.inline
    implicit class EmoticonRatingPropsMutableBuilder[Self <: EmoticonRatingProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnChange(value: /* args */ ValueNumber => js.Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOverrides(value: RatingOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait RatingOverrides extends StObject {
    
    var Item: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
  }
  object RatingOverrides {
    
    @scala.inline
    def apply(): RatingOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RatingOverrides]
    }
    
    @scala.inline
    implicit class RatingOverridesMutableBuilder[Self <: RatingOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setItem(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Item", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemUndefined: Self = StObject.set(x, "Item", js.undefined)
      
      @scala.inline
      def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
    }
  }
  
  trait RatingState extends StObject {
    
    var previewIndex: js.UndefOr[Double] = js.undefined
  }
  object RatingState {
    
    @scala.inline
    def apply(): RatingState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RatingState]
    }
    
    @scala.inline
    implicit class RatingStateMutableBuilder[Self <: RatingState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setPreviewIndex(value: Double): Self = StObject.set(x, "previewIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreviewIndexUndefined: Self = StObject.set(x, "previewIndex", js.undefined)
    }
  }
  
  trait StarRatingProps extends StObject {
    
    var numItems: js.UndefOr[Double] = js.undefined
    
    var onChange: js.UndefOr[js.Function1[/* args */ ValueNumber, js.Any]] = js.undefined
    
    var overrides: js.UndefOr[RatingOverrides] = js.undefined
    
    var readOnly: js.UndefOr[Boolean] = js.undefined
    
    var size: js.UndefOr[Double] = js.undefined
    
    var value: js.UndefOr[Double] = js.undefined
  }
  object StarRatingProps {
    
    @scala.inline
    def apply(): StarRatingProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StarRatingProps]
    }
    
    @scala.inline
    implicit class StarRatingPropsMutableBuilder[Self <: StarRatingProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setNumItems(value: Double): Self = StObject.set(x, "numItems", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumItemsUndefined: Self = StObject.set(x, "numItems", js.undefined)
      
      @scala.inline
      def setOnChange(value: /* args */ ValueNumber => js.Any): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOverrides(value: RatingOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
  
  trait StyledRatingItemProps extends StObject {
    
    @JSName("$index")
    var $index: Double
    
    @JSName("$isActive")
    var $isActive: Boolean
    
    @JSName("$isSelected")
    var $isSelected: Boolean
    
    @JSName("$theme")
    var $theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any
  }
  object StyledRatingItemProps {
    
    @scala.inline
    def apply(
      $index: Double,
      $isActive: Boolean,
      $isSelected: Boolean,
      $theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any
    ): StyledRatingItemProps = {
      val __obj = js.Dynamic.literal($index = $index.asInstanceOf[js.Any], $isActive = $isActive.asInstanceOf[js.Any], $isSelected = $isSelected.asInstanceOf[js.Any], $theme = $theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyledRatingItemProps]
    }
    
    @scala.inline
    implicit class StyledRatingItemPropsMutableBuilder[Self <: StyledRatingItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$index(value: Double): Self = StObject.set(x, "$index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$isActive(value: Boolean): Self = StObject.set(x, "$isActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$isSelected(value: Boolean): Self = StObject.set(x, "$isSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def set$theme(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any
      ): Self = StObject.set(x, "$theme", value.asInstanceOf[js.Any])
    }
  }
  
  trait StyledRootProps extends StObject {
    
    @JSName("$theme")
    var $theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any
  }
  object StyledRootProps {
    
    @scala.inline
    def apply(
      $theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any
    ): StyledRootProps = {
      val __obj = js.Dynamic.literal($theme = $theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[StyledRootProps]
    }
    
    @scala.inline
    implicit class StyledRootPropsMutableBuilder[Self <: StyledRootProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def set$theme(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any
      ): Self = StObject.set(x, "$theme", value.asInstanceOf[js.Any])
    }
  }
}

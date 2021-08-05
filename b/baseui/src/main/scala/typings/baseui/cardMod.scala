package typings.baseui

import typings.baseui.anon.Thumbnail
import typings.react.mod.DetailedHTMLProps
import typings.react.mod.FC
import typings.react.mod.ImgHTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLImageElement
import typings.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cardMod {
  
  @JSImport("baseui/card", "Card")
  @js.native
  val Card: FC[CardProps] = js.native
  
  @JSImport("baseui/card", "StyledAction")
  @js.native
  val StyledAction: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/card", "StyledBody")
  @js.native
  val StyledBody: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/card", "StyledContents")
  @js.native
  val StyledContents: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/card", "StyledHeaderImage")
  @js.native
  val StyledHeaderImage: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/card", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/card", "StyledThumbnail")
  @js.native
  val StyledThumbnail: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/card", "StyledTitle")
  @js.native
  val StyledTitle: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/card", "StyledWrapper")
  @js.native
  val StyledWrapper: StyletronComponent[js.Any] = js.native
  
  trait CardOverrides extends StObject {
    
    var Action: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Body: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Contents: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var HeaderImage: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Root: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Thumbnail: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
    
    var Title: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.undefined
  }
  object CardOverrides {
    
    inline def apply(): CardOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardOverrides]
    }
    
    extension [Self <: CardOverrides](x: Self) {
      
      inline def setAction(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "Action", js.undefined)
      
      inline def setBody(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "Body", js.undefined)
      
      inline def setContents(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Contents", value.asInstanceOf[js.Any])
      
      inline def setContentsUndefined: Self = StObject.set(x, "Contents", js.undefined)
      
      inline def setHeaderImage(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "HeaderImage", value.asInstanceOf[js.Any])
      
      inline def setHeaderImageUndefined: Self = StObject.set(x, "HeaderImage", js.undefined)
      
      inline def setRoot(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Root", value.asInstanceOf[js.Any])
      
      inline def setRootUndefined: Self = StObject.set(x, "Root", js.undefined)
      
      inline def setThumbnail(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Thumbnail", value.asInstanceOf[js.Any])
      
      inline def setThumbnailUndefined: Self = StObject.set(x, "Thumbnail", js.undefined)
      
      inline def setTitle(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "Title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "Title", js.undefined)
    }
  }
  
  trait CardProps extends StObject {
    
    val action: js.UndefOr[ReactNode] = js.undefined
    
    val children: js.UndefOr[ReactNode] = js.undefined
    
    val hasThumbnail: js.UndefOr[js.Function1[/* props */ Thumbnail, Boolean]] = js.undefined
    
    val headerImage: js.UndefOr[
        String | (DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement])
      ] = js.undefined
    
    val overrides: js.UndefOr[CardOverrides] = js.undefined
    
    val thumbnail: js.UndefOr[String] = js.undefined
    
    val title: js.UndefOr[ReactNode] = js.undefined
  }
  object CardProps {
    
    inline def apply(): CardProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CardProps]
    }
    
    extension [Self <: CardProps](x: Self) {
      
      inline def setAction(value: ReactNode): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      inline def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setHasThumbnail(value: /* props */ Thumbnail => Boolean): Self = StObject.set(x, "hasThumbnail", js.Any.fromFunction1(value))
      
      inline def setHasThumbnailUndefined: Self = StObject.set(x, "hasThumbnail", js.undefined)
      
      inline def setHeaderImage(value: String | (DetailedHTMLProps[ImgHTMLAttributes[HTMLImageElement], HTMLImageElement])): Self = StObject.set(x, "headerImage", value.asInstanceOf[js.Any])
      
      inline def setHeaderImageUndefined: Self = StObject.set(x, "headerImage", js.undefined)
      
      inline def setOverrides(value: CardOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      inline def setThumbnail(value: String): Self = StObject.set(x, "thumbnail", value.asInstanceOf[js.Any])
      
      inline def setThumbnailUndefined: Self = StObject.set(x, "thumbnail", js.undefined)
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type hasThumbnail = js.Function1[/* props */ Thumbnail, Boolean]
}

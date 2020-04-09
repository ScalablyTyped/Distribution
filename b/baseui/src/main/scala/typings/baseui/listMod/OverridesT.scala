package typings.baseui.listMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverridesT extends js.Object {
  var ArtworkContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<StyledArtworkContainerPropsT> */ js.Any
  ] = js.undefined
  var Content: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<StyledContentPropsT> */ js.Any
  ] = js.undefined
  var EndEnhancerContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
  ] = js.undefined
  var Root: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any
  ] = js.undefined
}

object OverridesT {
  @scala.inline
  def apply(
    ArtworkContainer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<StyledArtworkContainerPropsT> */ js.Any = null,
    Content: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<StyledContentPropsT> */ js.Any = null,
    EndEnhancerContainer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any = null,
    Root: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<{}> */ js.Any = null
  ): OverridesT = {
    val __obj = js.Dynamic.literal()
    if (ArtworkContainer != null) __obj.updateDynamic("ArtworkContainer")(ArtworkContainer.asInstanceOf[js.Any])
    if (Content != null) __obj.updateDynamic("Content")(Content.asInstanceOf[js.Any])
    if (EndEnhancerContainer != null) __obj.updateDynamic("EndEnhancerContainer")(EndEnhancerContainer.asInstanceOf[js.Any])
    if (Root != null) __obj.updateDynamic("Root")(Root.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverridesT]
  }
}


package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Content extends js.Object {
  var Content: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
  var Footer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
  var Heading: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
  var MenuButton: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
}

object Content {
  @scala.inline
  def apply(
    Content: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null,
    Footer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null,
    Heading: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null,
    MenuButton: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null
  ): Content = {
    val __obj = js.Dynamic.literal()
    if (Content != null) __obj.updateDynamic("Content")(Content.asInstanceOf[js.Any])
    if (Footer != null) __obj.updateDynamic("Footer")(Footer.asInstanceOf[js.Any])
    if (Heading != null) __obj.updateDynamic("Heading")(Heading.asInstanceOf[js.Any])
    if (MenuButton != null) __obj.updateDynamic("MenuButton")(MenuButton.asInstanceOf[js.Any])
    __obj.asInstanceOf[Content]
  }
}


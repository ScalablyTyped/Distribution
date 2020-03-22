package typings.commitlintLoad.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Rules extends js.Object {
  var `body-leading-blank`: js.UndefOr[Rule[js.UndefOr[scala.Nothing]]] = js.undefined
  var `body-max-length`: js.UndefOr[Rule[Double]] = js.undefined
  var `body-max-line-length`: js.UndefOr[Rule[Double]] = js.undefined
  var `body-min-length`: js.UndefOr[Rule[Double]] = js.undefined
  var `footer-leading-blank`: js.UndefOr[Rule[js.UndefOr[scala.Nothing]]] = js.undefined
  var `footer-max-length`: js.UndefOr[Rule[Double]] = js.undefined
  var `footer-max-line-length`: js.UndefOr[Rule[Double]] = js.undefined
  var `footer-min-length`: js.UndefOr[Rule[Double]] = js.undefined
  var `header-case`: js.UndefOr[Rule[Case]] = js.undefined
  var `header-full-stop`: js.UndefOr[Rule[String]] = js.undefined
  var `header-max-length`: js.UndefOr[Rule[Double]] = js.undefined
  var `header-min-length`: js.UndefOr[Rule[Double]] = js.undefined
  var `references-empty`: js.UndefOr[Rule[js.UndefOr[scala.Nothing]]] = js.undefined
  var `scope-case`: js.UndefOr[Rule[Case]] = js.undefined
  var `scope-empty`: js.UndefOr[Rule[js.UndefOr[scala.Nothing]]] = js.undefined
  var `scope-enum`: js.UndefOr[Rule[js.Array[String]]] = js.undefined
  var `scope-max-length`: js.UndefOr[Rule[Double]] = js.undefined
  var `scope-min-length`: js.UndefOr[Rule[Double]] = js.undefined
  var `signed-off-by`: js.UndefOr[Rule[String]] = js.undefined
  var `subject-case`: js.UndefOr[Rule[Case | js.Array[Case]]] = js.undefined
  var `subject-empty`: js.UndefOr[Rule[js.UndefOr[scala.Nothing]]] = js.undefined
  var `subject-full-stop`: js.UndefOr[Rule[String]] = js.undefined
  var `subject-max-length`: js.UndefOr[Rule[Double]] = js.undefined
  var `subject-min-length`: js.UndefOr[Rule[Double]] = js.undefined
  var `type-case`: js.UndefOr[Rule[Case]] = js.undefined
  var `type-empty`: js.UndefOr[Rule[js.UndefOr[scala.Nothing]]] = js.undefined
  var `type-enum`: js.UndefOr[Rule[js.Array[String]]] = js.undefined
  var `type-max-length`: js.UndefOr[Rule[Double]] = js.undefined
  var `type-min-length`: js.UndefOr[Rule[Double]] = js.undefined
}

object Rules {
  @scala.inline
  def apply(
    `body-leading-blank`: Rule[js.UndefOr[scala.Nothing]] = null,
    `body-max-length`: Rule[Double] = null,
    `body-max-line-length`: Rule[Double] = null,
    `body-min-length`: Rule[Double] = null,
    `footer-leading-blank`: Rule[js.UndefOr[scala.Nothing]] = null,
    `footer-max-length`: Rule[Double] = null,
    `footer-max-line-length`: Rule[Double] = null,
    `footer-min-length`: Rule[Double] = null,
    `header-case`: Rule[Case] = null,
    `header-full-stop`: Rule[String] = null,
    `header-max-length`: Rule[Double] = null,
    `header-min-length`: Rule[Double] = null,
    `references-empty`: Rule[js.UndefOr[scala.Nothing]] = null,
    `scope-case`: Rule[Case] = null,
    `scope-empty`: Rule[js.UndefOr[scala.Nothing]] = null,
    `scope-enum`: Rule[js.Array[String]] = null,
    `scope-max-length`: Rule[Double] = null,
    `scope-min-length`: Rule[Double] = null,
    `signed-off-by`: Rule[String] = null,
    `subject-case`: Rule[Case | js.Array[Case]] = null,
    `subject-empty`: Rule[js.UndefOr[scala.Nothing]] = null,
    `subject-full-stop`: Rule[String] = null,
    `subject-max-length`: Rule[Double] = null,
    `subject-min-length`: Rule[Double] = null,
    `type-case`: Rule[Case] = null,
    `type-empty`: Rule[js.UndefOr[scala.Nothing]] = null,
    `type-enum`: Rule[js.Array[String]] = null,
    `type-max-length`: Rule[Double] = null,
    `type-min-length`: Rule[Double] = null
  ): Rules = {
    val __obj = js.Dynamic.literal()
    if (`body-leading-blank` != null) __obj.updateDynamic("body-leading-blank")(`body-leading-blank`.asInstanceOf[js.Any])
    if (`body-max-length` != null) __obj.updateDynamic("body-max-length")(`body-max-length`.asInstanceOf[js.Any])
    if (`body-max-line-length` != null) __obj.updateDynamic("body-max-line-length")(`body-max-line-length`.asInstanceOf[js.Any])
    if (`body-min-length` != null) __obj.updateDynamic("body-min-length")(`body-min-length`.asInstanceOf[js.Any])
    if (`footer-leading-blank` != null) __obj.updateDynamic("footer-leading-blank")(`footer-leading-blank`.asInstanceOf[js.Any])
    if (`footer-max-length` != null) __obj.updateDynamic("footer-max-length")(`footer-max-length`.asInstanceOf[js.Any])
    if (`footer-max-line-length` != null) __obj.updateDynamic("footer-max-line-length")(`footer-max-line-length`.asInstanceOf[js.Any])
    if (`footer-min-length` != null) __obj.updateDynamic("footer-min-length")(`footer-min-length`.asInstanceOf[js.Any])
    if (`header-case` != null) __obj.updateDynamic("header-case")(`header-case`.asInstanceOf[js.Any])
    if (`header-full-stop` != null) __obj.updateDynamic("header-full-stop")(`header-full-stop`.asInstanceOf[js.Any])
    if (`header-max-length` != null) __obj.updateDynamic("header-max-length")(`header-max-length`.asInstanceOf[js.Any])
    if (`header-min-length` != null) __obj.updateDynamic("header-min-length")(`header-min-length`.asInstanceOf[js.Any])
    if (`references-empty` != null) __obj.updateDynamic("references-empty")(`references-empty`.asInstanceOf[js.Any])
    if (`scope-case` != null) __obj.updateDynamic("scope-case")(`scope-case`.asInstanceOf[js.Any])
    if (`scope-empty` != null) __obj.updateDynamic("scope-empty")(`scope-empty`.asInstanceOf[js.Any])
    if (`scope-enum` != null) __obj.updateDynamic("scope-enum")(`scope-enum`.asInstanceOf[js.Any])
    if (`scope-max-length` != null) __obj.updateDynamic("scope-max-length")(`scope-max-length`.asInstanceOf[js.Any])
    if (`scope-min-length` != null) __obj.updateDynamic("scope-min-length")(`scope-min-length`.asInstanceOf[js.Any])
    if (`signed-off-by` != null) __obj.updateDynamic("signed-off-by")(`signed-off-by`.asInstanceOf[js.Any])
    if (`subject-case` != null) __obj.updateDynamic("subject-case")(`subject-case`.asInstanceOf[js.Any])
    if (`subject-empty` != null) __obj.updateDynamic("subject-empty")(`subject-empty`.asInstanceOf[js.Any])
    if (`subject-full-stop` != null) __obj.updateDynamic("subject-full-stop")(`subject-full-stop`.asInstanceOf[js.Any])
    if (`subject-max-length` != null) __obj.updateDynamic("subject-max-length")(`subject-max-length`.asInstanceOf[js.Any])
    if (`subject-min-length` != null) __obj.updateDynamic("subject-min-length")(`subject-min-length`.asInstanceOf[js.Any])
    if (`type-case` != null) __obj.updateDynamic("type-case")(`type-case`.asInstanceOf[js.Any])
    if (`type-empty` != null) __obj.updateDynamic("type-empty")(`type-empty`.asInstanceOf[js.Any])
    if (`type-enum` != null) __obj.updateDynamic("type-enum")(`type-enum`.asInstanceOf[js.Any])
    if (`type-max-length` != null) __obj.updateDynamic("type-max-length")(`type-max-length`.asInstanceOf[js.Any])
    if (`type-min-length` != null) __obj.updateDynamic("type-min-length")(`type-min-length`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Rules]
  }
}


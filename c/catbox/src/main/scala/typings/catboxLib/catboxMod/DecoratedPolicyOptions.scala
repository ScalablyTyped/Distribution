package typings
package catboxLib.catboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- catboxLib.catboxMod.PolicyOptionVariants because Already inherited */ trait DecoratedPolicyOptions[T] extends PolicyOptions[T] {
  /**
    * @default false
    */
  var getDecoratedValue: js.UndefOr[scala.Boolean]
}

object DecoratedPolicyOptions {
  @scala.inline
  def apply[T](
    dropOnError: js.UndefOr[scala.Boolean] = js.undefined,
    expiresAt: java.lang.String = null,
    expiresIn: scala.Int | scala.Double = null,
    generateFunc: GenerateFunc[T] = null,
    generateIgnoreWriteError: js.UndefOr[scala.Boolean] = js.undefined,
    generateOnReadError: js.UndefOr[scala.Boolean] = js.undefined,
    generateTimeout: scala.Double | catboxLib.catboxLibNumbers.`false` = null,
    getDecoratedValue: js.UndefOr[scala.Boolean] = js.undefined,
    pendingGenerateTimeout: scala.Int | scala.Double = null,
    staleIn: scala.Double | (js.Function2[/* stored */ scala.Double, /* ttl */ scala.Double, scala.Double]) = null,
    staleTimeout: scala.Int | scala.Double = null
  ): DecoratedPolicyOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(dropOnError)) __obj.updateDynamic("dropOnError")(dropOnError)
    if (expiresAt != null) __obj.updateDynamic("expiresAt")(expiresAt)
    if (expiresIn != null) __obj.updateDynamic("expiresIn")(expiresIn.asInstanceOf[js.Any])
    if (generateFunc != null) __obj.updateDynamic("generateFunc")(generateFunc)
    if (!js.isUndefined(generateIgnoreWriteError)) __obj.updateDynamic("generateIgnoreWriteError")(generateIgnoreWriteError)
    if (!js.isUndefined(generateOnReadError)) __obj.updateDynamic("generateOnReadError")(generateOnReadError)
    if (generateTimeout != null) __obj.updateDynamic("generateTimeout")(generateTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(getDecoratedValue)) __obj.updateDynamic("getDecoratedValue")(getDecoratedValue)
    if (pendingGenerateTimeout != null) __obj.updateDynamic("pendingGenerateTimeout")(pendingGenerateTimeout.asInstanceOf[js.Any])
    if (staleIn != null) __obj.updateDynamic("staleIn")(staleIn.asInstanceOf[js.Any])
    if (staleTimeout != null) __obj.updateDynamic("staleTimeout")(staleTimeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecoratedPolicyOptions[T]]
  }
}


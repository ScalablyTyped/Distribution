package typings.cypress.JQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * @see \`{@link https://api.jquery.com/animate/#animate-properties-options }\`
  */
trait EffectsOptions[TElement] extends js.Object {
  /**
    * A function to be called when the animation on an element completes or stops without completing (its
    * Promise object is either resolved or rejected).
    */
  var always: js.UndefOr[
    js.ThisFunction2[/* this */ TElement, /* animation */ Promise[_, _, _], /* jumpedToEnd */ Boolean, Unit]
  ] = js.undefined
  /**
    * A function that is called once the animation on an element is complete.
    */
  var complete: js.UndefOr[js.ThisFunction0[/* this */ TElement, Unit]] = js.undefined
  /**
    * A function to be called when the animation on an element completes (its Promise object is resolved).
    */
  var done: js.UndefOr[
    js.ThisFunction2[/* this */ TElement, /* animation */ Promise[_, _, _], /* jumpedToEnd */ Boolean, Unit]
  ] = js.undefined
  /**
    * A string or number determining how long the animation will run.
    */
  var duration: js.UndefOr[Duration] = js.undefined
  /**
    * A string indicating which easing function to use for the transition.
    */
  var easing: js.UndefOr[String] = js.undefined
  /**
    * A function to be called when the animation on an element fails to complete (its Promise object is rejected).
    */
  var fail: js.UndefOr[
    js.ThisFunction2[/* this */ TElement, /* animation */ Promise[_, _, _], /* jumpedToEnd */ Boolean, Unit]
  ] = js.undefined
  /**
    * A function to be called after each step of the animation, only once per animated element regardless
    * of the number of animated properties.
    */
  var progress: js.UndefOr[
    js.ThisFunction3[
      /* this */ TElement, 
      /* animation */ Promise[_, _, _], 
      /* progress */ Double, 
      /* remainingMs */ Double, 
      Unit
    ]
  ] = js.undefined
  /**
    * A Boolean indicating whether to place the animation in the effects queue. If false, the animation
    * will begin immediately. As of jQuery 1.7, the queue option can also accept a string, in which case
    * the animation is added to the queue represented by that string. When a custom queue name is used the
    * animation does not automatically start; you must call .dequeue("queuename") to start it.
    */
  var queue: js.UndefOr[Boolean | String] = js.undefined
  /**
    * An object containing one or more of the CSS properties defined by the properties argument and their
    * corresponding easing functions.
    */
  var specialEasing: js.UndefOr[PlainObject[String]] = js.undefined
  /**
    * A function to call when the animation on an element begins.
    */
  var start: js.UndefOr[js.ThisFunction1[/* this */ TElement, /* animation */ Promise[_, _, _], Unit]] = js.undefined
  /**
    * A function to be called for each animated property of each animated element. This function provides
    * an opportunity to modify the Tween object to change the value of the property before it is set.
    */
  var step: js.UndefOr[
    js.ThisFunction2[/* this */ TElement, /* now */ Double, /* tween */ Tween[TElement], Unit]
  ] = js.undefined
}

object EffectsOptions {
  @scala.inline
  def apply[TElement](
    always: js.ThisFunction2[/* this */ TElement, /* animation */ Promise[_, _, _], /* jumpedToEnd */ Boolean, Unit] = null,
    complete: js.ThisFunction0[/* this */ TElement, Unit] = null,
    done: js.ThisFunction2[/* this */ TElement, /* animation */ Promise[_, _, _], /* jumpedToEnd */ Boolean, Unit] = null,
    duration: Duration = null,
    easing: String = null,
    fail: js.ThisFunction2[/* this */ TElement, /* animation */ Promise[_, _, _], /* jumpedToEnd */ Boolean, Unit] = null,
    progress: js.ThisFunction3[
      /* this */ TElement, 
      /* animation */ Promise[_, _, _], 
      /* progress */ Double, 
      /* remainingMs */ Double, 
      Unit
    ] = null,
    queue: Boolean | String = null,
    specialEasing: PlainObject[String] = null,
    start: js.ThisFunction1[/* this */ TElement, /* animation */ Promise[_, _, _], Unit] = null,
    step: js.ThisFunction2[/* this */ TElement, /* now */ Double, /* tween */ Tween[TElement], Unit] = null
  ): EffectsOptions[TElement] = {
    val __obj = js.Dynamic.literal()
    if (always != null) __obj.updateDynamic("always")(always)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (done != null) __obj.updateDynamic("done")(done)
    if (duration != null) __obj.updateDynamic("duration")(duration.asInstanceOf[js.Any])
    if (easing != null) __obj.updateDynamic("easing")(easing)
    if (fail != null) __obj.updateDynamic("fail")(fail)
    if (progress != null) __obj.updateDynamic("progress")(progress)
    if (queue != null) __obj.updateDynamic("queue")(queue.asInstanceOf[js.Any])
    if (specialEasing != null) __obj.updateDynamic("specialEasing")(specialEasing)
    if (start != null) __obj.updateDynamic("start")(start)
    if (step != null) __obj.updateDynamic("step")(step)
    __obj.asInstanceOf[EffectsOptions[TElement]]
  }
}


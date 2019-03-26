package typings
package cypressLib.JQueryNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Type parameter guide
// --------------------
// Each type parameter represents a parameter in one of the three possible callbacks.
//
// The first letter indicates which position the parameter is in.
//
// T = A = 1st position
// U = B = 2nd position
// V = C = 3rd position
// S = R = rest position
//
// The second letter indicates which whether it is a [R]esolve, Re[J]ect, or [N]otify value.
//
// The third letter indicates whether the value is returned in the [D]one filter, [F]ail filter, or [P]rogress filter.
/**
  * This object provides a subset of the methods of the Deferred object (then, done, fail, always,
  * pipe, progress, state and promise) to prevent users from changing the state of the Deferred.
  *
  * @see \`{@link http://api.jquery.com/Types/#Promise }\`
  */
@js.native
trait PromiseBase[TR, TJ, TN, UR, UJ, UN, VR, VJ, VN, SR, SJ, SN]
  extends _Promise[TR]
     with stdLib.PromiseLike[TR] {
  /**
    * Add handlers to be called when the Deferred object is either resolved or rejected.
    *
    * @param alwaysCallback A function, or array of functions, that is called when the Deferred is resolved or rejected.
    * @param alwaysCallbacks Optional additional functions, or arrays of functions, that are called when the Deferred is resolved or rejected.
    * @see \`{@link https://api.jquery.com/deferred.always/ }\`
    * @since 1.6
    */
  def always(
    alwaysCallback: TypeOrArray[cypressLib.JQueryNs.DeferredNs.CallbackBase[TR | TJ, UR | UJ, VR | VJ, SR | SJ]],
    alwaysCallbacks: (TypeOrArray[cypressLib.JQueryNs.DeferredNs.CallbackBase[TR | TJ, UR | UJ, VR | VJ, SR | SJ]])*
  ): this.type = js.native
  def `catch`[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF](
    failFilter: js.Function4[
      /* t */ TJ, 
      /* u */ UJ, 
      /* v */ VJ, 
      /* repeated */ SJ, 
      (PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF]) | Thenable[ARF] | ARF
    ]
  ): PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF] = js.native
  /**
    * Add handlers to be called when the Deferred object is resolved.
    *
    * @param doneCallback A function, or array of functions, that are called when the Deferred is resolved.
    * @param doneCallbacks Optional additional functions, or arrays of functions, that are called when the Deferred is resolved.
    * @see \`{@link https://api.jquery.com/deferred.done/ }\`
    * @since 1.5
    */
  def done(
    doneCallback: TypeOrArray[cypressLib.JQueryNs.DeferredNs.CallbackBase[TR, UR, VR, SR]],
    doneCallbacks: (TypeOrArray[cypressLib.JQueryNs.DeferredNs.CallbackBase[TR, UR, VR, SR]])*
  ): this.type = js.native
  /**
    * Add handlers to be called when the Deferred object is rejected.
    *
    * @param failCallback A function, or array of functions, that are called when the Deferred is rejected.
    * @param failCallbacks Optional additional functions, or arrays of functions, that are called when the Deferred is rejected.
    * @see \`{@link https://api.jquery.com/deferred.fail/ }\`
    * @since 1.5
    */
  def fail(
    failCallback: TypeOrArray[cypressLib.JQueryNs.DeferredNs.CallbackBase[TJ, UJ, VJ, SJ]],
    failCallbacks: (TypeOrArray[cypressLib.JQueryNs.DeferredNs.CallbackBase[TJ, UJ, VJ, SJ]])*
  ): this.type = js.native
  /**
    * Utility method to filter and/or chain Deferreds.
    *
    * @param doneFilter An optional function that is called when the Deferred is resolved.
    * @param failFilter An optional function that is called when the Deferred is rejected.
    * @param progressFilter An optional function that is called when progress notifications are sent to the Deferred.
    * @see \`{@link https://api.jquery.com/deferred.pipe/ }\`
    * @since 1.6
    * @since 1.7
    *
    * @deprecated Deprecated since 1.8. Use \`{@link then JQuery.PromiseBase.then }\`.
    */
  def pipe[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP](): PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP] = js.native
  /**
    * Utility method to filter and/or chain Deferreds.
    *
    * @param doneFilter An optional function that is called when the Deferred is resolved.
    * @param failFilter An optional function that is called when the Deferred is rejected.
    * @param progressFilter An optional function that is called when progress notifications are sent to the Deferred.
    * @see \`{@link https://api.jquery.com/deferred.pipe/ }\`
    * @since 1.6
    * @since 1.7
    *
    * @deprecated Deprecated since 1.8. Use \`{@link then JQuery.PromiseBase.then }\`.
    */
  def pipe[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND](
    doneFilter: js.Function4[
      /* t */ TR, 
      /* u */ UR, 
      /* v */ VR, 
      /* repeated */ SR, 
      (PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND]) | Thenable[ARD] | ARD
    ]
  ): PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND] = js.native
  /**
    * Utility method to filter and/or chain Deferreds.
    *
    * @param doneFilter An optional function that is called when the Deferred is resolved.
    * @param failFilter An optional function that is called when the Deferred is rejected.
    * @param progressFilter An optional function that is called when progress notifications are sent to the Deferred.
    * @see \`{@link https://api.jquery.com/deferred.pipe/ }\`
    * @since 1.6
    * @since 1.7
    *
    * @deprecated Deprecated since 1.8. Use \`{@link then JQuery.PromiseBase.then }\`.
    */
  def pipe[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF](
    doneFilter: scala.Null,
    failFilter: js.Function4[
      /* t */ TJ, 
      /* u */ UJ, 
      /* v */ VJ, 
      /* repeated */ SJ, 
      (PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF]) | Thenable[AJF] | AJF
    ]
  ): PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF] = js.native
  def pipe[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP](
    doneFilter: scala.Null,
    failFilter: scala.Null,
    progressFilter: js.Function4[
      /* t */ TN, 
      /* u */ UN, 
      /* v */ VN, 
      /* repeated */ SN, 
      (PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP]) | Thenable[ANP] | ANP
    ]
  ): PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP] = js.native
  /**
    * Utility method to filter and/or chain Deferreds.
    *
    * @param doneFilter An optional function that is called when the Deferred is resolved.
    * @param failFilter An optional function that is called when the Deferred is rejected.
    * @param progressFilter An optional function that is called when progress notifications are sent to the Deferred.
    * @see \`{@link https://api.jquery.com/deferred.pipe/ }\`
    * @since 1.6
    * @since 1.7
    *
    * @deprecated Deprecated since 1.8. Use \`{@link then JQuery.PromiseBase.then }\`.
    */
  def pipe[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND, ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF](
    doneFilter: js.Function4[
      /* t */ TR, 
      /* u */ UR, 
      /* v */ VR, 
      /* repeated */ SR, 
      (PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND]) | Thenable[ARD] | ARD
    ],
    failFilter: js.Function4[
      /* t */ TJ, 
      /* u */ UJ, 
      /* v */ VJ, 
      /* repeated */ SJ, 
      (PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF]) | Thenable[AJF] | AJF
    ]
  ): PromiseBase[
    ARD | ARF, 
    AJD | AJF, 
    AND | ANF, 
    BRD | BRF, 
    BJD | BJF, 
    BND | BNF, 
    CRD | CRF, 
    CJD | CJF, 
    CND | CNF, 
    RRD | RRF, 
    RJD | RJF, 
    RND | RNF
  ] = js.native
  /**
    * Utility method to filter and/or chain Deferreds.
    *
    * @param doneFilter An optional function that is called when the Deferred is resolved.
    * @param failFilter An optional function that is called when the Deferred is rejected.
    * @param progressFilter An optional function that is called when progress notifications are sent to the Deferred.
    * @see \`{@link https://api.jquery.com/deferred.pipe/ }\`
    * @since 1.6
    * @since 1.7
    *
    * @deprecated Deprecated since 1.8. Use \`{@link then JQuery.PromiseBase.then }\`.
    */
  def pipe[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND, ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP](
    doneFilter: js.Function4[
      /* t */ TR, 
      /* u */ UR, 
      /* v */ VR, 
      /* repeated */ SR, 
      (PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND]) | Thenable[ARD] | ARD
    ],
    failFilter: scala.Null,
    progressFilter: js.Function4[
      /* t */ TN, 
      /* u */ UN, 
      /* v */ VN, 
      /* repeated */ SN, 
      (PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP]) | Thenable[ANP] | ANP
    ]
  ): PromiseBase[
    ARD | ARP, 
    AJD | AJP, 
    AND | ANP, 
    BRD | BRP, 
    BJD | BJP, 
    BND | BNP, 
    CRD | CRP, 
    CJD | CJP, 
    CND | CNP, 
    RRD | RRP, 
    RJD | RJP, 
    RND | RNP
  ] = js.native
  /**
    * Utility method to filter and/or chain Deferreds.
    *
    * @param doneFilter An optional function that is called when the Deferred is resolved.
    * @param failFilter An optional function that is called when the Deferred is rejected.
    * @param progressFilter An optional function that is called when progress notifications are sent to the Deferred.
    * @see \`{@link https://api.jquery.com/deferred.pipe/ }\`
    * @since 1.6
    * @since 1.7
    *
    * @deprecated Deprecated since 1.8. Use \`{@link then JQuery.PromiseBase.then }\`.
    */
  def pipe[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF, ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP](
    doneFilter: scala.Null,
    failFilter: js.Function4[
      /* t */ TJ, 
      /* u */ UJ, 
      /* v */ VJ, 
      /* repeated */ SJ, 
      (PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF]) | Thenable[AJF] | AJF
    ],
    progressFilter: js.Function4[
      /* t */ TN, 
      /* u */ UN, 
      /* v */ VN, 
      /* repeated */ SN, 
      (PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP]) | Thenable[ANP] | ANP
    ]
  ): PromiseBase[
    ARF | ARP, 
    AJF | AJP, 
    ANF | ANP, 
    BRF | BRP, 
    BJF | BJP, 
    BNF | BNP, 
    CRF | CRP, 
    CJF | CJP, 
    CNF | CNP, 
    RRF | RRP, 
    RJF | RJP, 
    RNF | RNP
  ] = js.native
  // region pipe
  /**
    * Utility method to filter and/or chain Deferreds.
    *
    * @param doneFilter An optional function that is called when the Deferred is resolved.
    * @param failFilter An optional function that is called when the Deferred is rejected.
    * @param progressFilter An optional function that is called when progress notifications are sent to the Deferred.
    * @see \`{@link https://api.jquery.com/deferred.pipe/ }\`
    * @since 1.6
    * @since 1.7
    *
    * @deprecated Deprecated since 1.8. Use \`{@link then JQuery.PromiseBase.then }\`.
    */
  def pipe[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND, ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF, ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP](
    doneFilter: js.Function4[
      /* t */ TR, 
      /* u */ UR, 
      /* v */ VR, 
      /* repeated */ SR, 
      (PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND]) | Thenable[ARD] | ARD
    ],
    failFilter: js.Function4[
      /* t */ TJ, 
      /* u */ UJ, 
      /* v */ VJ, 
      /* repeated */ SJ, 
      (PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF]) | Thenable[AJF] | AJF
    ],
    progressFilter: js.Function4[
      /* t */ TN, 
      /* u */ UN, 
      /* v */ VN, 
      /* repeated */ SN, 
      (PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP]) | Thenable[ANP] | ANP
    ]
  ): PromiseBase[
    ARD | ARF | ARP, 
    AJD | AJF | AJP, 
    AND | ANF | ANP, 
    BRD | BRF | BRP, 
    BJD | BJF | BJP, 
    BND | BNF | BNP, 
    CRD | CRF | CRP, 
    CJD | CJF | CJP, 
    CND | CNF | CNP, 
    RRD | RRF | RRP, 
    RJD | RJF | RJP, 
    RND | RNF | RNP
  ] = js.native
  /**
    * Add handlers to be called when the Deferred object generates progress notifications.
    *
    * @param progressCallback A function, or array of functions, to be called when the Deferred generates progress notifications.
    * @param progressCallbacks Optional additional functions, or arrays of functions, to be called when the Deferred generates
    *                          progress notifications.
    * @see \`{@link https://api.jquery.com/deferred.progress/ }\`
    * @since 1.7
    */
  def progress(
    progressCallback: TypeOrArray[cypressLib.JQueryNs.DeferredNs.CallbackBase[TN, UN, VN, SN]],
    progressCallbacks: (TypeOrArray[cypressLib.JQueryNs.DeferredNs.CallbackBase[TN, UN, VN, SN]])*
  ): this.type = js.native
  /**
    * Return a Deferred's Promise object.
    *
    * @see \`{@link https://api.jquery.com/deferred.promise/ }\`
    * @since 1.5
    */
  def promise(): this.type = js.native
  /**
    * Return a Deferred's Promise object.
    *
    * @param target Object onto which the promise methods have to be attached
    * @see \`{@link https://api.jquery.com/deferred.promise/ }\`
    * @since 1.5
    */
  def promise[TTarget /* <: js.Object */](target: TTarget): this.type with TTarget = js.native
  /**
    * Determine the current state of a Deferred object.
    *
    * @see \`{@link https://api.jquery.com/deferred.state/ }\`
    * @since 1.7
    */
  def state(): cypressLib.cypressLibStrings.pending | cypressLib.cypressLibStrings.resolved | cypressLib.cypressLibStrings.rejected = js.native
  /**
    * Attaches callbacks for the resolution and/or rejection of the Promise.
    * @param onfulfilled The callback to execute when the Promise is resolved.
    * @param onrejected The callback to execute when the Promise is rejected.
    * @returns A Promise for the completion of which ever callback is executed.
    */
  /* InferMemberOverrides */
  override def `then`[TResult1, TResult2](): (_Promise[TResult1 | TResult2]) with (js.Thenable[TResult1 | TResult2]) = js.native
  /* InferMemberOverrides */
  override def `then`[TResult1, TResult2](onfulfilled: js.Function1[TR, TResult1 | js.Thenable[TResult1]]): (_Promise[TResult1 | TResult2]) with (js.Thenable[TResult1 | TResult2]) = js.native
  /* InferMemberOverrides */
  override def `then`[TResult1, TResult2](
    onfulfilled: js.Function1[TR, TResult1 | js.Thenable[TResult1]],
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): (_Promise[TResult1 | TResult2]) with (js.Thenable[TResult1 | TResult2]) = js.native
  /* InferMemberOverrides */
  override def `then`[TResult1, TResult2](
    onfulfilled: scala.Null,
    onrejected: js.Function1[/* reason */ js.Any, TResult2 | js.Thenable[TResult2]]
  ): (_Promise[TResult1 | TResult2]) with (js.Thenable[TResult1 | TResult2]) = js.native
  /**
    * Add handlers to be called when the Deferred object is resolved, rejected, or still in progress.
    *
    * @param doneFilter An optional function that is called when the Deferred is resolved.
    * @param failFilter An optional function that is called when the Deferred is rejected.
    * @param progressFilter An optional function that is called when progress notifications are sent to the Deferred.
    * @see \`{@link https://api.jquery.com/deferred.then/ }\`
    * @since 1.8
    */
  def `then`[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND](
    doneFilter: js.Function4[
      /* t */ TR, 
      /* u */ UR, 
      /* v */ VR, 
      /* repeated */ SR, 
      (PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND]) | Thenable[ARD] | ARD
    ]
  ): PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND] = js.native
  /**
    * Add handlers to be called when the Deferred object is resolved, rejected, or still in progress.
    *
    * @param doneFilter An optional function that is called when the Deferred is resolved.
    * @param failFilter An optional function that is called when the Deferred is rejected.
    * @param progressFilter An optional function that is called when progress notifications are sent to the Deferred.
    * @see \`{@link https://api.jquery.com/deferred.then/ }\`
    * @since 1.8
    */
  def `then`[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF](
    doneFilter: scala.Null,
    failFilter: js.Function4[
      /* t */ TJ, 
      /* u */ UJ, 
      /* v */ VJ, 
      /* repeated */ SJ, 
      (PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF]) | Thenable[ARF] | ARF
    ]
  ): PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF] = js.native
  def `then`[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP](
    doneFilter: scala.Null,
    failFilter: scala.Null,
    progressFilter: js.Function4[
      /* t */ TN, 
      /* u */ UN, 
      /* v */ VN, 
      /* repeated */ SN, 
      (PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP]) | Thenable[ANP] | ANP
    ]
  ): PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP] = js.native
  /**
    * Add handlers to be called when the Deferred object is resolved, rejected, or still in progress.
    *
    * @param doneFilter An optional function that is called when the Deferred is resolved.
    * @param failFilter An optional function that is called when the Deferred is rejected.
    * @param progressFilter An optional function that is called when progress notifications are sent to the Deferred.
    * @see \`{@link https://api.jquery.com/deferred.then/ }\`
    * @since 1.8
    */
  def `then`[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND, ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF](
    doneFilter: js.Function4[
      /* t */ TR, 
      /* u */ UR, 
      /* v */ VR, 
      /* repeated */ SR, 
      (PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND]) | Thenable[ARD] | ARD
    ],
    failFilter: js.Function4[
      /* t */ TJ, 
      /* u */ UJ, 
      /* v */ VJ, 
      /* repeated */ SJ, 
      (PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF]) | Thenable[ARF] | ARF
    ]
  ): PromiseBase[
    ARD | ARF, 
    AJD | AJF, 
    AND | ANF, 
    BRD | BRF, 
    BJD | BJF, 
    BND | BNF, 
    CRD | CRF, 
    CJD | CJF, 
    CND | CNF, 
    RRD | RRF, 
    RJD | RJF, 
    RND | RNF
  ] = js.native
  /**
    * Add handlers to be called when the Deferred object is resolved, rejected, or still in progress.
    *
    * @param doneFilter An optional function that is called when the Deferred is resolved.
    * @param failFilter An optional function that is called when the Deferred is rejected.
    * @param progressFilter An optional function that is called when progress notifications are sent to the Deferred.
    * @see \`{@link https://api.jquery.com/deferred.then/ }\`
    * @since 1.8
    */
  def `then`[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND, ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP](
    doneFilter: js.Function4[
      /* t */ TR, 
      /* u */ UR, 
      /* v */ VR, 
      /* repeated */ SR, 
      (PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND]) | Thenable[ARD] | ARD
    ],
    failFilter: scala.Null,
    progressFilter: js.Function4[
      /* t */ TN, 
      /* u */ UN, 
      /* v */ VN, 
      /* repeated */ SN, 
      (PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP]) | Thenable[ANP] | ANP
    ]
  ): PromiseBase[
    ARD | ARP, 
    AJD | AJP, 
    AND | ANP, 
    BRD | BRP, 
    BJD | BJP, 
    BND | BNP, 
    CRD | CRP, 
    CJD | CJP, 
    CND | CNP, 
    RRD | RRP, 
    RJD | RJP, 
    RND | RNP
  ] = js.native
  /**
    * Add handlers to be called when the Deferred object is resolved, rejected, or still in progress.
    *
    * @param doneFilter An optional function that is called when the Deferred is resolved.
    * @param failFilter An optional function that is called when the Deferred is rejected.
    * @param progressFilter An optional function that is called when progress notifications are sent to the Deferred.
    * @see \`{@link https://api.jquery.com/deferred.then/ }\`
    * @since 1.8
    */
  def `then`[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF, ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP](
    doneFilter: scala.Null,
    failFilter: js.Function4[
      /* t */ TJ, 
      /* u */ UJ, 
      /* v */ VJ, 
      /* repeated */ SJ, 
      (PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF]) | Thenable[ARF] | ARF
    ],
    progressFilter: js.Function4[
      /* t */ TN, 
      /* u */ UN, 
      /* v */ VN, 
      /* repeated */ SN, 
      (PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP]) | Thenable[ANP] | ANP
    ]
  ): PromiseBase[
    ARF | ARP, 
    AJF | AJP, 
    ANF | ANP, 
    BRF | BRP, 
    BJF | BJP, 
    BNF | BNP, 
    CRF | CRP, 
    CJF | CJP, 
    CNF | CNP, 
    RRF | RRP, 
    RJF | RJP, 
    RNF | RNP
  ] = js.native
  // endregion
  // region then
  /**
    * Add handlers to be called when the Deferred object is resolved, rejected, or still in progress.
    *
    * @param doneFilter An optional function that is called when the Deferred is resolved.
    * @param failFilter An optional function that is called when the Deferred is rejected.
    * @param progressFilter An optional function that is called when progress notifications are sent to the Deferred.
    * @see \`{@link https://api.jquery.com/deferred.then/ }\`
    * @since 1.8
    */
  def `then`[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND, ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF, ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP](
    doneFilter: js.Function4[
      /* t */ TR, 
      /* u */ UR, 
      /* v */ VR, 
      /* repeated */ SR, 
      (PromiseBase[ARD, AJD, AND, BRD, BJD, BND, CRD, CJD, CND, RRD, RJD, RND]) | Thenable[ARD] | ARD
    ],
    failFilter: js.Function4[
      /* t */ TJ, 
      /* u */ UJ, 
      /* v */ VJ, 
      /* repeated */ SJ, 
      (PromiseBase[ARF, AJF, ANF, BRF, BJF, BNF, CRF, CJF, CNF, RRF, RJF, RNF]) | Thenable[ARF] | ARF
    ],
    progressFilter: js.Function4[
      /* t */ TN, 
      /* u */ UN, 
      /* v */ VN, 
      /* repeated */ SN, 
      (PromiseBase[ARP, AJP, ANP, BRP, BJP, BNP, CRP, CJP, CNP, RRP, RJP, RNP]) | Thenable[ANP] | ANP
    ]
  ): PromiseBase[
    ARD | ARF | ARP, 
    AJD | AJF | AJP, 
    AND | ANF | ANP, 
    BRD | BRF | BRP, 
    BJD | BJF | BJP, 
    BND | BNF | BNP, 
    CRD | CRF | CRP, 
    CJD | CJF | CJP, 
    CND | CNF | CNP, 
    RRD | RRF | RRP, 
    RJD | RJF | RJP, 
    RND | RNF | RNP
  ] = js.native
}

